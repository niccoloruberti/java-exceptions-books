package org.lessons.java.book;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	
	static final File bookList = new File("./bookList.txt");
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Quanti libri vuoi inserire?");
		String nBookStr = in.nextLine();
		int nBook = Integer.valueOf(nBookStr);
		
		Book[] books = new Book[nBook]; 
		
		int i = 0;
		
		while (i < nBook) {
			
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
				
				books[i] = new Book(title, nPage, author, publisher);
				i++;
				
			} catch (Exception e) {
				
				System.err.println(e.getMessage());;
				
			}
		}
		
		in.close();
		
		//scrivo nel file
		
		FileWriter myWriter = null;
		
		try {
			
			myWriter = new FileWriter(bookList);
			
			for (int x=0 ; x < books.length; x++) {
				
				Book b = books[x];
				
				myWriter.write(b + "\n");
			}
		} catch (IOException e) {
			
			System.out.println("Error writing file: " + e.getMessage());
		} finally {
			
			if (myWriter != null)
				try {
					myWriter.close();
				} catch (IOException e) { }
		}	
		
		
		//leggo dal file
		
		Scanner reader = null;
		
		try {
			
			reader = new Scanner(bookList);
			
			while (reader.hasNextLine()) {
			   String data = reader.nextLine();
			   
				System.out.println(data);
			}
		} catch (FileNotFoundException e) {
			
			System.out.println("Error reading file: " + e.getMessage());
		} finally {
			
			if (reader != null) {
				
				reader.close();
			}
		}
		
	}
	
}
