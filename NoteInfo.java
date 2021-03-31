package com.notepad;

public class NoteInfo 
{
	private String title;
	private String description;
	private String id;
	public void setId(String id)
	{
		this.id=id;
	}
	public String getId()
	{
		return id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
