package org.zerock.myapp.repository;

import lombok.Cleanup;
import lombok.extern.log4j.Log4j2;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Repository;
import org.zerock.myapp.domain.member.MemberDTO;
import org.zerock.myapp.domain.member.MemberVO;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Log4j2
@Repository
public class MemberMabtisXmlDAO implements MemberDAO {

    private final SqlSessionFactory sqlSessionFactory;
    private final String namespace = "org.zerock.myapp.repository.MemberMabatisXmlDAO";

    public MemberMabtisXmlDAO() {
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();

        String resource = "mybatis-config.xml";
        try {
            @Cleanup
            InputStream inputStream = Resources.getResourceAsStream(resource);
            this.sqlSessionFactory = builder.build(inputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<MemberVO> selectAll() {
        log.trace("selectAll() invoked");

        SqlSession session = sqlSessionFactory.openSession();

        String statement = namespace +".selectAll";

        List<MemberVO> list = session.selectList(statement);
        return list;
    }

    @Override
    public Integer insertMember(MemberDTO dto) {
        log.trace("insertMember({}) invoked.", dto);

        SqlSession session = this.sqlSessionFactory.openSession();
        String statement = namespace+".insertMember";

        return session.insert(statement, dto);
    }

    @Override
    public Integer updateMember(MemberDTO dto) {
        log.trace("updateMember({}) invoked.", dto);

        SqlSession session = this.sqlSessionFactory.openSession();
        String statement = namespace+".updateMember";

        return session.update(statement, dto);
    }

    @Override
    public Integer deleteMember(Integer memberId) {
        log.trace("deleteMember({}) invoked.", memberId);

        SqlSession session = this.sqlSessionFactory.openSession();
        String statement = namespace+".deleteMember";

        return session.delete(statement, memberId);
    }

    @Override
    public String findById(String name, String phone) {
        log.trace("findById({}, {}) invoked", name, phone);

        SqlSession session = this.sqlSessionFactory.openSession();
        String statement = namespace+".findById";

        Map<String, String> map = new HashMap<>();
        map.put("memberName", name);
        map.put("memberPhone", phone);

        return session.selectOne(statement, map);
    }

    @Override
    public String findByPasswd(String id) {
        return null;
    }

    @Override
    public List<MemberVO> memberInfo(MemberDTO dto) {
        return null;
    }
}
