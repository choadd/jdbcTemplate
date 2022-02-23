package net.edupoll.kr.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import net.edupoll.kr.entity.MessageVo;

@Repository
public class MessageDao {

	@Autowired
	JdbcTemplate template;

	public int insert(String sender, String receiver, String content) {

		String sql = "insert into message values(?,?,?, sysdate)";

		return template.update(sql, sender, receiver, content);
	}
	
	public int deleteBySender(String sender) {
		String sql = "delete from message where sender=?";
		return template.update(sql, sender);
	}

	public List selectAll() {
		String sql = "select * from message order by senddate desc";
		RowMapper<MessageVo> mapper = new RowMapper<MessageVo>() {
			@Override
			public MessageVo mapRow(ResultSet rs, int rowNum) throws SQLException {
				MessageVo vo = new MessageVo();
				vo.setSender(rs.getString("sender"));
				vo.setReceiver(rs.getString("receiver"));
				vo.setContent(rs.getString("content"));
				vo.setSenddate(rs.getDate("senddate"));
				return vo;
			}
		};

		return template.query(sql, mapper);
	}

	public List<MessageVo> selectAll2() {
		String sql = "select * from message order by senddate desc";
		RowMapper<MessageVo> mapper = BeanPropertyRowMapper.newInstance(MessageVo.class);
		return template.query(sql, mapper);
	}

	
}
