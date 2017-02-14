package com.epam.library.bean;

public abstract class Edition{
	
	private String title;
	private int publicDate;
	
	public Edition(String title, int publicDate){
		this.title=title;
		this.publicDate=publicDate;
	}
	public String getTitle(){
		return title;
	}
	public void setTitle(String title){
		this.title=title;
	}
	public int getPublicDate(){
		return publicDate;
	}
	public void setPublicDate(int pablicDate){
		this.publicDate=pablicDate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + publicDate;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Edition other = (Edition) obj;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (publicDate != other.publicDate)
			return false;
		return true;
	}

	@Override
	public String toString(){
		 return "title: "+ title+ "date of publication: " + publicDate;
	 }

}

