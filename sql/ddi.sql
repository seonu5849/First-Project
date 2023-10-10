-- 멤버 시퀀스
create sequence seq_member
minvalue 1
start with 1
increment by 1
nocache
nocycle;

DROP TABLE CAFE_PRODUCT;

-- 회원테이블
CREATE TABLE MEMBER(
    MEMBER_NO NUMBER(20) NOT NULL,
    MEMBER_ID VARCHAR2(20) NOT NULL,
    MEMBER_PW VARCHAR2(20) NOT NULL,
    MEMBER_NAME VARCHAR2(20) NOT NULL,
    MEMBER_PHONE VARCHAR2(30) NULL,
    MEMBER_ROLE NUMBER(1) DEFAULT 1,

    CONSTRAINT member_member_no_pk PRIMARY KEY(MEMBER_NO)
);

-- 카페 테이블
CREATE TABLE CAFE(
    CAFE_NO NUMBER(20) NOT NULL,
    CAFE_NAME VARCHAR2(20) NOT NULL,

    CONSTRAINT cafe_cafe_no_pk PRIMARY KEY(CAFE_NO)
);

-- 카페 카테고리 테이블
CREATE TABLE CAFE_KATEGORIE(
    KATEGORIE_NO NUMBER(20) NOT NULL,
    KATEGORIE VARCHAR2(20) NOT NULL,

    CONSTRAINT cafe_kategorie_no_pk PRIMARY KEY(KATEGORIE_NO)
);

-- 카페 상품 테이블
CREATE TABLE CAFE_PRODUCT(
    PRODUCT_NO NUMBER(20) NOT NULL,
    CAFE_NO NUMBER(20) NOT NULL,
    KATEGORIE_NO NUMBER(20) NOT NULL,
    PRODUCT_NAME VARCHAR2(50) NOT NULL,
    PRODUCT_CONTENT VARCHAR2(255) NOT NULL,
    PRODUCT_CALORIE NUMBER NOT NULL,

    CONSTRAINT product_no_pk PRIMARY KEY(PRODUCT_NO),
    CONSTRAINT cafe_no_fk FOREIGN KEY(CAFE_NO) REFERENCES CAFE(CAFE_NO),
    CONSTRAINT kategorie_no_fk FOREIGN KEY(KATEGORIE_NO) REFERENCES CAFE_KATEGORIE(KATEGORIE_NO)
);

--alter table CAFE_PRODUCT modify PRODUCT_NAME varchar2(50);

-- 첨부파일
CREATE TABLE ATTACHMENT(
    ATTACHMENT_NO NUMBER(20) NOT NULL,
    PRODUCT_NO NUMBER(20) NOT NULL,
    ATTACHMENT_NAME VARCHAR2(50) NOT NULL,
    ATTACHMENT_PATH VARCHAR2(255) NOT NULL,
    ATTACHMENT_DATE DATE DEFAULT CURRENT_DATE,

    CONSTRAINT attachment_no_pk PRIMARY KEY(ATTACHMENT_NO),
    CONSTRAINT product_no_fk FOREIGN KEY(PRODUCT_NO) REFERENCES CAFE_PRODUCT(PRODUCT_NO)
);

-- 카페 임시 데이터 넣기
insert into cafe values(1, '스타벅스');
insert into cafe values(2, '이디야');
insert into cafe values(3, '투썸플레이스');
insert into cafe values(4, '메가커피');

-- 카페 카테고리 임시 데이터 넣기
insert into cafe_kategorie values(1, '커피');
insert into cafe_kategorie values(2, '논커피');
insert into cafe_kategorie values(3, '디카페인');
insert into cafe_kategorie values(4, '푸드');
insert into cafe_kategorie values(5, '상품');

-- 커피 상품 임시 데이터 넣기
insert into cafe_product values(1, 1, 1, '나이트로 바닐라 크림', '부드러운 목넘김의 나이트로 커피와 바닐라 크림의 매력을 한번에 느껴보세요!', '80');
insert into cafe_product values(2, 1, 1, '나이트로 콜드 브루', '나이트로 커피 정통의 캐스케이딩과 부드러운 콜드 크레마!\n부드러운 목 넘김과 완벽한 밸런스에 커피 본연의 단맛을 경험할 수 있습니다.', '5');

select * from cafe_product;

select
    PRODUCT_NO,
    c.CAFE_NAME,
    k.KATEGORIE,
    PRODUCT_NAME,
    p.product_content,
    PRODUCT_CALORIE
from cafe_product p, cafe c, cafe_kategorie k
where
    p.cafe_no = c.cafe_no
    AND p.kategorie_no = k.kategorie_no;

-- 회원 임시 데이터 넣기
insert into member values(seq_member.NEXTVAL, 'admin', '1234', '관리자', '010-1234-5678', 2);
insert into member(member_no, member_id, member_pw, member_name, member_phone) values(seq_member.NEXTVAL, 'origial', '1234', '일반인', '010-1212-3434');
insert into member(member_no, member_id, member_pw, member_name, member_phone) values(seq_member.NEXTVAL, 'o123', '1234', 'o123', '010-1231-1241');

select * from member;



