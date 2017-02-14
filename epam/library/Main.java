package com.epam.library;

import com.epam.library.service.Service;

public class Main {
	
	public static void main(String[] args) {
		
		Service service =new Service();
		
		service.moreThanOneBook();
		service.leastTwoBooks();
		service.renameBook();
	}
}
