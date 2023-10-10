package org.zerock.myapp.domain;

import lombok.Data;
import lombok.Value;

@Data
public class MemberDTO {

    private Integer memberNo;
    private String memberId;
    private String memberPw;
    private String memberName;
    private String memberPhone;
    private String memberRole;
    
}
