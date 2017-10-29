package edu.ldcollege.domain;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;
import java.util.Map;

public interface LdHomeWorkMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ld_home_work
     *
     * @mbg.generated
     */
    @Delete({
        "delete from ld_home_work",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ld_home_work
     *
     * @mbg.generated
     */
    @Insert({
        "insert into ld_home_work (id, user_id, ",
        "class_id, lesson_id, ",
        "homework_file_path, homework_name, ",
        "create_date, correct_flag, ",
        "star_count, negative_count, ",
        "best_flag)",
        "values (#{id,jdbcType=INTEGER}, #{userId,jdbcType=INTEGER}, ",
        "#{classId,jdbcType=INTEGER}, #{lessonId,jdbcType=INTEGER}, ",
        "#{homeworkFilePath,jdbcType=VARCHAR}, #{homeworkName,jdbcType=VARCHAR}, ",
        "#{createDate,jdbcType=DATE}, #{correctFlag,jdbcType=INTEGER}, ",
        "#{starCount,jdbcType=INTEGER}, #{negativeCount,jdbcType=INTEGER}, ",
        "#{bestFlag,jdbcType=INTEGER})"
    })
    int insert(LdHomeWork record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ld_home_work
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "id, user_id, class_id, lesson_id, homework_file_path, homework_name, create_date, ",
        "correct_flag, star_count, negative_count, best_flag",
        "from ld_home_work",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="class_id", property="classId", jdbcType=JdbcType.INTEGER),
        @Result(column="lesson_id", property="lessonId", jdbcType=JdbcType.INTEGER),
        @Result(column="homework_file_path", property="homeworkFilePath", jdbcType=JdbcType.VARCHAR),
        @Result(column="homework_name", property="homeworkName", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_date", property="createDate", jdbcType=JdbcType.DATE),
        @Result(column="correct_flag", property="correctFlag", jdbcType=JdbcType.INTEGER),
        @Result(column="star_count", property="starCount", jdbcType=JdbcType.INTEGER),
        @Result(column="negative_count", property="negativeCount", jdbcType=JdbcType.INTEGER),
        @Result(column="best_flag", property="bestFlag", jdbcType=JdbcType.INTEGER)
    })
    LdHomeWork selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ld_home_work
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "id, user_id, class_id, lesson_id, homework_file_path, homework_name, create_date, ",
        "correct_flag, star_count, negative_count, best_flag",
        "from ld_home_work"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="class_id", property="classId", jdbcType=JdbcType.INTEGER),
        @Result(column="lesson_id", property="lessonId", jdbcType=JdbcType.INTEGER),
        @Result(column="homework_file_path", property="homeworkFilePath", jdbcType=JdbcType.VARCHAR),
        @Result(column="homework_name", property="homeworkName", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_date", property="createDate", jdbcType=JdbcType.DATE),
        @Result(column="correct_flag", property="correctFlag", jdbcType=JdbcType.INTEGER),
        @Result(column="star_count", property="starCount", jdbcType=JdbcType.INTEGER),
        @Result(column="negative_count", property="negativeCount", jdbcType=JdbcType.INTEGER),
        @Result(column="best_flag", property="bestFlag", jdbcType=JdbcType.INTEGER)
    })
    List<LdHomeWork> selectAll();


    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ld_home_work
     *
     * @mbg.generated
     */
    @Update({
        "update ld_home_work",
        "set user_id = #{userId,jdbcType=INTEGER},",
          "class_id = #{classId,jdbcType=INTEGER},",
          "lesson_id = #{lessonId,jdbcType=INTEGER},",
          "homework_file_path = #{homeworkFilePath,jdbcType=VARCHAR},",
          "homework_name = #{homeworkName,jdbcType=VARCHAR},",
          "create_date = #{createDate,jdbcType=DATE},",
          "correct_flag = #{correctFlag,jdbcType=INTEGER},",
          "star_count = #{starCount,jdbcType=INTEGER},",
          "negative_count = #{negativeCount,jdbcType=INTEGER},",
          "best_flag = #{bestFlag,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(LdHomeWork record);
}