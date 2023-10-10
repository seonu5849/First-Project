package org.zerock.myapp.domain.member;

import lombok.Value;

@Value
public class MemberVO {

    private Integer memberNo;
    private String memberId;
    private String memberPw;
    private String memberName;
    private String memberPhone;
    private String memberRole;

}
