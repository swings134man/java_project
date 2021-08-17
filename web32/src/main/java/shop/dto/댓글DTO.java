package shop.dto;


public class 댓글DTO {
	int id;
	String content;
	String boardId;
	String writer;
	public 댓글DTO(int id, String content, String boardId, String writer) {
		super();
		this.id = id;
		this.content = content;
		this.boardId = boardId;
		this.writer = writer;
	}
	
	
	
	
	public 댓글DTO() {
		super();
	
	}




	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getBoardId() {
		return boardId;
	}
	public void setBoardId(String boardId) {
		this.boardId = boardId;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	} 
	
	@Override
	public String toString() {
		return "댓글DTO [id=" + id + ", content=" + content + ", boardId=" + boardId + ", writer=" + writer + "]";
	}
	
	
	
}
