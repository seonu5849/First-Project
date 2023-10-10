package org.zerock.myapp.repository;

public interface ItemDAO {

    public abstract void itemAll(); // 상품 전체 출력
    public abstract void itemInfo(); // 상세 정보
    public abstract void insertItem(); // 상품 추가
    public abstract void updateItem(); // 상품 수정
    public abstract void deleteItem(); // 상품 삭제

}
