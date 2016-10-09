package service;

import java.util.List;

import domain.Comment;


public interface CommentService
{
	// ���ͼ��
	int addComment(Comment comment);

	List<Comment> getAllComments();
	
	void deleteComment(int id);
}
