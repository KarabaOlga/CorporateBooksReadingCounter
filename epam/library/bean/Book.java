package com.epam.library.bean;

public class Book extends Edition {
	
	private String author;
	//private String brief;
	//  Book (title, author, brief, date of publishing),
	public Book(String title, String author, int publicDate){
		super(title, publicDate);
		this.author=author;
		
	}
	public String getAuthor(){
		return author;
	}
	public void setAuthor(String author){
		this.author=author;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		return true;
	}

	public String toString(){
		 return "title: "+ getTitle() + "author: " +author +"date of publication: " + getPublicDate();
	 }
}
