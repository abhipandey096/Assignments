package bookapp.service;
import java.util.List;
import java.util.stream.Collectors;

import bookappdao.BookDao;

public class BookServiceImpl implements BookService {
	
	private BookDao bookDao;

	public void setBookDao(BookDao bookDao) {
		this.bookDao = bookDao;
	}

	@Override
	public List<String> getBooks(String subject) {
		return bookDao.getBooks().stream().filter
				(title -> title.contains(subject)).collect(Collectors.toList());

	}
}
