package org.lessons.java.book;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Quanti libri vuoi inserire?");
		String nBookStr = in.nextLine();
		int nBook = Integer.valueOf(nBookStr);
		
		Book[] books = new Book[nBook]; 
		
		for (int x = 0; x < nBook; x++) {
			
			System.out.println("Inserisci il titolo del libro: ");
			String title = in.nextLine();
			
			System.out.println("Inserisci il numero delle pagine: ");
			String nPageStr = in.nextLine();
			int nPage = Integer.valueOf(nPageStr);
			
			System.out.println("Inserisci l'autore: ");
			String author = in.nextLine();
			
			System.out.println("inserisci l'editore: ");
			String publisher = in.nextLine();
			
			try {
				
				books[x] = new Book(title, nPage, author, publisher);
				
			} catch (Exception e) {
				
				System.err.println(e.getMessage());;
				
			}
		}
		
		in.close();
				
		if(!(books == null)) {
			
			for (int x = 0; x < books.length; x++) {
			    if (books[x] != null) {
			        System.out.println(books[x]);
			        
			    }
			}
		}
		

	}
	
}
