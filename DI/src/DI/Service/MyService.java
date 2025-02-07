package DI.Service;

import java.util.List;

import DI.DAO.BoardDAO;
import DI.DAO.CommentDAO;
import DI.DTO.Board;
import DI.DTO.Comment;

// MyService 클래스
public class MyService {
    private final BoardDAO boardDAO;
    private final CommentDAO commentDAO;

    // 생성자를 통한 의존성 주입
    public MyService(BoardDAO boardDAO) {
        this.boardDAO = boardDAO;
        this.commentDAO = null; // CommentDAO는 null로 초기화
    }

    // 또 다른 생성자를 통한 의존성 주입
    public MyService(CommentDAO commentDAO) {
        this.boardDAO = null; // BoardDAO는 null로 초기화
        this.commentDAO = commentDAO;
    }

    // selectAll() 메소드 정의
    public List<Board> selectBoardAll() {
        // BoardDAO를 사용하여 게시물 목록을 가져옴
        return boardDAO.getAllBoards();
    }

    // 다른 selectAll() 메소드 정의
    public List<Comment> selectCommentAll() {
        // CommentDAO를 사용하여 댓글 목록을 가져옴
        return commentDAO.getAllComments();
    }
}