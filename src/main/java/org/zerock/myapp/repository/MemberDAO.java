package org.zerock.myapp.repository;

import org.zerock.myapp.domain.member.MemberDTO;
import org.zerock.myapp.domain.member.MemberVO;

import java.util.List;

public interface MemberDAO {

    public abstract List<MemberVO> selectAll(); // 멤버 전체 조회 - 테스트
    public abstract Integer insertMember(MemberDTO dto); // 회원 추가
    public abstract Integer updateMember(MemberDTO dto); // 회원 수정
    public abstract Integer deleteMember(Integer memberId); // 회원 삭제
    public abstract String findById(String name, String phone); // 아이디 찾기
    public abstract String findByPasswd(String id); // 비밀번호 찾기
    public abstract List<MemberVO> memberInfo(MemberDTO dto); // 상세 조회

}
