package com.nagarro.avirup.controller;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.nagarro.avirup.model.Book;
import com.nagarro.avirup.model.User;
import com.nagarro.avirup.service.Authenticator;
import com.nagarro.avirup.service.BookService;
import com.nagarro.avirup.service.UserService;

@Controller
public class BookController {

	@Autowired
	private BookService bookService;
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private Authenticator authenticator;
	
	@GetMapping("/")
	public String login(HttpServletRequest request)
	{
		request.getSession().invalidate();
		
		return "login.jsp";
	}
	
	@PostMapping("loginAuthenticator")
	public String loginAuthenticator(HttpServletRequest request)
	{
		User user = new User();
		
		user.setUserId(request.getParameter("id"));
		user.setPassword(request.getParameter("password"));
		
		boolean result = authenticator.check(userService.getAllUsers(), user);
		
		if(result) {
		
			request.getSession().setAttribute("id", user.getUserId());
			
			return "redirect:homePage";
		}
		else
			return "failed.jsp";
	}
	
	@PostMapping("failed")
	public String failed(HttpServletRequest request)
	{
		return "redirect:/";
	}
	
	@PostMapping("forgot")
	public String forgot(HttpServletRequest request)
	{
		return "register.jsp";
	}
	
	@PostMapping("registerUser")
	public String registerUser(HttpServletRequest request)
	{
		User user = new User();
		user.setUserId(request.getParameter("id"));
		user.setPassword(request.getParameter("password"));
		
		userService.saveUser(user);
		
		return "redirect:homePage";
	}
	
	@PostMapping("logout")
	public String logout(HttpServletRequest request)
	{
		request.getSession().invalidate();
		
		return "redirect:/";
	}
	
	// display list of book
	
	@GetMapping("homePage")
	public String viewHomePage(HttpServletRequest request)
	{
		//model.addAttribute("listBooks", bookService.getAllBooks());
		request.getSession().setAttribute("listBooks", bookService.getAllBooks());
		return "home.jsp";
	}
	
	@GetMapping("addBookForm")
	public String addBook(HttpServletRequest request)
	{
		Book book = new Book();
		request.getSession().setAttribute("book", book);
		return "newBook.jsp";
	}
	
	@PostMapping("saveBook")
	public String saveBook(HttpServletRequest request)
	{
		Book book = new Book();
		
		DateFormat DFormat = DateFormat.getDateTimeInstance(
	            DateFormat.LONG, DateFormat.LONG,
	            Locale.getDefault());
		
		Calendar cal = Calendar.getInstance();
		
		String curr_date = DFormat.format(cal.getTime());
		
		book.setAuthor(request.getParameter("author"));
		book.setCode(Integer.parseInt(request.getParameter("code")));
		book.setName(request.getParameter("name"));
		book.setDate(curr_date);
		
		bookService.saveBook(book);
		
		return "redirect:homePage";
	}
	
	@GetMapping("update/{id}")
	public String update(@PathVariable(value="id") long id, HttpServletRequest request)
	{
		System.out.println("id: " + id);
		Book book = bookService.getBookbyId(id);
		request.getSession().setAttribute("updateBook", book);
		
		System.out.println(book);
		
		return "updateBook.jsp";
	}
	
//	@GetMapping("update")
//	public String update()
//	{
//		return "update_book.jsp";
//	}
	
	@GetMapping("delete/{id}")
	public String delete(@PathVariable(value="id") long id)
	{
		
		this.bookService.deleteBookById(id);
		
		System.out.println("deleted");
		
		return "redirect:homePage";
	}
	
}
