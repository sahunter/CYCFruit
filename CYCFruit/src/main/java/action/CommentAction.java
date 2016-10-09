package action;

import java.io.File;
import java.util.List;
import java.io.*;

import com.opensymphony.xwork2.ActionSupport;

import domain.Comment;

import service.CommentService;


public class CommentAction extends ActionSupport {
	private CommentService commentService;
	
	public void setCommentService(CommentService commentService) {
		this.commentService = commentService;
	} 
	
	private Comment comment;
	private List<Comment> comments;
	private int id;
	
	//��װ�ļ������������������
		private String title;
		//��װ�ϴ��ļ��������
		private File upload;
		//��װ�ϴ��ļ����͵�����
		private String uploadContentType;
		//��װ�ϴ��ļ���������
		private String uploadFileName;
		//ֱ����struts.xml�ļ������õ�����
		private String savePath;
	
	public Comment getComment() {
		return comment;
	}
	public void setComment(Comment comment) {
		this.comment = comment;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public File getUpload() {
		return upload;
	}
	public void setUpload(File upload) {
		this.upload = upload;
	}
	public String getUploadContentType() {
		return uploadContentType;
	}
	public void setUploadContentType(String uploadContentType) {
		this.uploadContentType = uploadContentType;
	}
	public String getUploadFileName() {
		return uploadFileName;
	}
	public void setUploadFileName(String uploadFileName) {
		this.uploadFileName = uploadFileName;
	}
	public String getSavePath() {
		return savePath;
	}
	public void setSavePath(String savePath) {
		this.savePath = savePath;
	}
	
	public String add() throws Exception
	{
		comment.setPicture(uploadFileName);
		// ����ҵ���߼������addBook()�����������û�����		
		int result = commentService.addComment(comment);
		if(result > 0)
		{
			addActionMessage("��ϲ������ӳɹ���");
			
			FileOutputStream fos = new FileOutputStream(getSavePath()
					+ "\\" + getUploadFileName());
				FileInputStream fis = new FileInputStream(getUpload());
				byte[] buffer = new byte[1024];
				int len = 0;
				while ((len = fis.read(buffer)) > 0)
				{
					fos.write(buffer , 0 , len);
				}
				fos.close();
			
			return SUCCESS;
		}
		addActionError("���ʧ�ܣ����������룡");
		return ERROR;
	}
	public String list()
	{
		setComments(commentService.getAllComments());
		return SUCCESS;
	}
	public String delete()
	{
		commentService.deleteComment(id);
		return SUCCESS;
	}
	
	
	
}
