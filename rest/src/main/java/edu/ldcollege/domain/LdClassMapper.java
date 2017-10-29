package edu.ldcollege.domain;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface LdClassMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ld_class
     *
     * @mbg.generated
     */
    @Delete({
        "delete from ld_class",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ld_class
     *
     * @mbg.generated
     */
    @Insert({
        "insert into ld_class (id, class_name, ",
        "description, created)",
        "values (#{id,jdbcType=INTEGER}, #{className,jdbcType=VARCHAR}, ",
        "#{description,jdbcType=VARCHAR}, #{created,jdbcType=DATE})"
    })
    int insert(LdClass record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ld_class
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "id, class_name, description, created",
        "from ld_class",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="class_name", property="className", jdbcType=JdbcType.VARCHAR),
        @Result(column="description", property="description", jdbcType=JdbcType.VARCHAR),
        @Result(column="created", property="created", jdbcType=JdbcType.DATE)
    })
    LdClass selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ld_class
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "id, class_name, description, created",
        "from ld_class"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="class_name", property="className", jdbcType=JdbcType.VARCHAR),
        @Result(column="description", property="description", jdbcType=JdbcType.VARCHAR),
        @Result(column="created", property="created", jdbcType=JdbcType.DATE)
    })
    List<LdClass> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ld_class
     *
     * @mbg.generated
     */
    @Update({
        "update ld_class",
        "set class_name = #{className,jdbcType=VARCHAR},",
          "description = #{description,jdbcType=VARCHAR},",
          "created = #{created,jdbcType=DATE}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(LdClass record);
}