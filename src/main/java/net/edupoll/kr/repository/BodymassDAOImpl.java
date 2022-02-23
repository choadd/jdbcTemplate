package net.edupoll.kr.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import net.edupoll.kr.entity.BodyMassVO;

@Repository
public class BodymassDAOImpl implements BodymassDAO {

	@Autowired
	JdbcTemplate Bodytemplate;

//    ~18.5        ~       23      ~      25.0     ~   )
//저체중            정상             과체중           비만

	@Override
	public int insertData(int cm, int kg, int age, double rate, String result) {

		String sql = "insert into bodymass values(?,?,?,?,?)";
		// 비율 구하기
		rate = (double) (kg / Math.pow((double) cm / 100, 2));

		// 결과 값 구하기
		result = rate > 25.0 ? "비만" : rate > 23 ? "과체중" : rate > 18.5 ? "정상" : "저체중";

		return Bodytemplate.update(sql, cm, kg, age, rate, result);
	}

	@Override
	public int deleteData(int cm) {

		String sql = "delete from bodymass where cm=?";

		return Bodytemplate.update(sql, cm);
	}

	@Override
	public List info() {

		String sql = "select * from bodymass order by cm desc";

		RowMapper<BodyMassVO> mapper = BeanPropertyRowMapper.newInstance(BodyMassVO.class);

		return Bodytemplate.query(sql, mapper);
	}

}
