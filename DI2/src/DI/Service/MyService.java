package DI.Service;

import java.util.List;

import DI.DAO.BoardDAO;
import DI.DAO.CommentDAO;
import DI.DTO.Board;
import DI.DTO.Comment;

// MyService 클래스
public class MyService {
    private BoardDAO boardDAO;
    private CommentDAO commentDAO;

    // Setter 메서드를 통한 의존성 주입
    public void setBoardDAO(BoardDAO boardDAO) {
        this.boardDAO = boardDAO;
    }

    // Setter 메서드를 통한 의존성 주입
    public void setCommentDAO(CommentDAO commentDAO) {
        this.commentDAO = commentDAO;
    }

    // selectAll() 메소드 정의
    public List<Board> selectBoardAll() {
        // BoardDAO를 사용하여 게시물 목록을 가져옴
        return boardDAO.getAllBoards();
    }

    // selectAll() 메소드 정의
    public List<Comment> selectCommentAll() {
        // CommentDAO를 사용하여 댓글 목록을 가져옴
        return commentDAO.getAllComments();
    }
}