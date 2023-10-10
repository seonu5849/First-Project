package org.zerock.myapp.domain.item;

import lombok.Value;
import org.zerock.myapp.domain.cafe.CafeVO;
import org.zerock.myapp.domain.kategorie.KategorieVO;

@Value
public class ItemVO {
    private Long productNo; // 상품번호 (pk)
    private Long cafeNo; // 카페
    private Long kategorieNo; // 카테고리
    private String productName; // 이름
    private String productContent; // 내용
    private Integer productCalorie; // 칼로리
}
