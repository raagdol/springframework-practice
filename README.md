### 개발환경
- IntelliJ
- amazon corretto open jdk 11
- mysql 8
- mybatis
- JSP
- Tomcat 9

### 주요기능
- 회원가입
- 로그인
- 회원목록 출력
- 상세조회
- 수정
- 삭제
- ajax 이메일 중복체크

### 계정 생성하기
create database dbname; <br>
create user 'username@localhost' identified by 'password'; <br>
grant all privileges on dbname.* to username@localhost; <br>

### 회원 테이블
drop table if exists member_table; <br>
create table member_table( <br>
    id bigint primary key auto_increment, <br>
    memberEmail varchar(20) unique, <br>
    memberPassword varchar(20), <br>
    memberName varchar(20), <br>
    memberAge int, <br>
    memberMobile varchar(20) <br>
)