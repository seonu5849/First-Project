package org.zerock.myapp.repository;

import org.zerock.myapp.domain.MemberDTO;
import org.zerock.myapp.domain.MemberVO;

import java.util.List;

public interface MemberDAO {

    public abstract List<MemberVO> selectAll();
    public abstract Integer insertMember(MemberDTO dto);
    public abstract Integer updateMember(MemberDTO dto);
    public abstract Integer deleteMember(Integer memberId);

}
