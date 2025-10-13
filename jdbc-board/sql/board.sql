-- 게시판 프로젝트 데이터베이스 생성
CREATE DATABASE jdbc_board;
USE jdbc_board;

-- 게시판 테이블 생성
CREATE TABLE board (
	no INT AUTO_INCREMENT,
    title VARCHAR(100) NOT NULL,
    writer VARCHAR(100) NOT NULL,
    content TEXT,
    reg_date DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,  
    -- 기본 값으로 현재 시간을 넣겠다는 뜻이다.
    -- DATE 타입일 때: reg_date DATETIME NOT NULL DEFAULT CURRENT_DATE
	upd_date DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    -- ON UPDATE CURRENT_TIMESTAMP: UPDATE 시 자동으로 수정 시간도 갱신
    PRIMARY KEY (no)
);

DESC board;

-- 추가
INSERT INTO board (title, writer, content)
VALUES
('나는 문어' , '안예은','꿈을 꾸는 문어'),
('아기 상어' , '원작자 모름', '뚜뚜루두뚜');

-- 조회
SELECT *
FROM board; -- 전체 게시글 목록 조회

SELECT *
FROM board -- 특정 게시글 조회
WHERE title = '나는 문어';
-- 수정
UPDATE board
SET 
	title = '나는 문어 - 수정',
	writer = '안예은',
    content = '시작 되는거야'
    -- upd_date = now() -- 수정일을 현재 시간으로 갱신하는 쿼리문이다. 
    -- 처음에 테이블 시간 정의할때에 데이터베이스에서 현재시간을 가져오도록 설정했음으로 설정해주지 않아도 된다. 
WHERE NO = 1;
-- 삭제
DELETE FROM board
WHERE no = '1';

-- 댓글 테이블
CREATE TABLE comment (
	id INT AUTO_INCREMENT,
    board_no INT NOT NULL,
    commenter VARCHAR(50) NOT NULL,
    comment TEXT,
    reg_date DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY (id),
    FOREIGN KEY (board_no) REFERENCES board(no) ON DELETE CASCADE
    -- ON DELETE CASCADE: 왜래키(FK)에 설정하는 옵션으로
    -- 부모 테이블의 행이 삭제될 때, 해당 행을 참조하는 자식 테이블의 행들도 자동으로 삭제
    -- 예: board의 특정 게시글이 삭제되면 그 게시글에 달린 comment들도 자동으로 삭제
);


