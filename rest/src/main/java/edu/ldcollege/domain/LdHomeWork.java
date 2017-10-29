package edu.ldcollege.domain;

import java.util.Date;

public class LdHomeWork {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ld_home_work.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ld_home_work.user_id
     *
     * @mbg.generated
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ld_home_work.class_id
     *
     * @mbg.generated
     */
    private Integer classId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ld_home_work.lesson_id
     *
     * @mbg.generated
     */
    private Integer lessonId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ld_home_work.homework_file_path
     *
     * @mbg.generated
     */
    private String homeworkFilePath;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ld_home_work.homework_name
     *
     * @mbg.generated
     */
    private String homeworkName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ld_home_work.create_date
     *
     * @mbg.generated
     */
    private Date createDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ld_home_work.correct_flag
     *
     * @mbg.generated
     */
    private Integer correctFlag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ld_home_work.star_count
     *
     * @mbg.generated
     */
    private Integer starCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ld_home_work.negative_count
     *
     * @mbg.generated
     */
    private Integer negativeCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ld_home_work.best_flag
     *
     * @mbg.generated
     */
    private Integer bestFlag;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ld_home_work.id
     *
     * @return the value of ld_home_work.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ld_home_work.id
     *
     * @param id the value for ld_home_work.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ld_home_work.user_id
     *
     * @return the value of ld_home_work.user_id
     *
     * @mbg.generated
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ld_home_work.user_id
     *
     * @param userId the value for ld_home_work.user_id
     *
     * @mbg.generated
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ld_home_work.class_id
     *
     * @return the value of ld_home_work.class_id
     *
     * @mbg.generated
     */
    public Integer getClassId() {
        return classId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ld_home_work.class_id
     *
     * @param classId the value for ld_home_work.class_id
     *
     * @mbg.generated
     */
    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ld_home_work.lesson_id
     *
     * @return the value of ld_home_work.lesson_id
     *
     * @mbg.generated
     */
    public Integer getLessonId() {
        return lessonId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ld_home_work.lesson_id
     *
     * @param lessonId the value for ld_home_work.lesson_id
     *
     * @mbg.generated
     */
    public void setLessonId(Integer lessonId) {
        this.lessonId = lessonId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ld_home_work.homework_file_path
     *
     * @return the value of ld_home_work.homework_file_path
     *
     * @mbg.generated
     */
    public String getHomeworkFilePath() {
        return homeworkFilePath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ld_home_work.homework_file_path
     *
     * @param homeworkFilePath the value for ld_home_work.homework_file_path
     *
     * @mbg.generated
     */
    public void setHomeworkFilePath(String homeworkFilePath) {
        this.homeworkFilePath = homeworkFilePath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ld_home_work.homework_name
     *
     * @return the value of ld_home_work.homework_name
     *
     * @mbg.generated
     */
    public String getHomeworkName() {
        return homeworkName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ld_home_work.homework_name
     *
     * @param homeworkName the value for ld_home_work.homework_name
     *
     * @mbg.generated
     */
    public void setHomeworkName(String homeworkName) {
        this.homeworkName = homeworkName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ld_home_work.create_date
     *
     * @return the value of ld_home_work.create_date
     *
     * @mbg.generated
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ld_home_work.create_date
     *
     * @param createDate the value for ld_home_work.create_date
     *
     * @mbg.generated
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ld_home_work.correct_flag
     *
     * @return the value of ld_home_work.correct_flag
     *
     * @mbg.generated
     */
    public Integer getCorrectFlag() {
        return correctFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ld_home_work.correct_flag
     *
     * @param correctFlag the value for ld_home_work.correct_flag
     *
     * @mbg.generated
     */
    public void setCorrectFlag(Integer correctFlag) {
        this.correctFlag = correctFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ld_home_work.star_count
     *
     * @return the value of ld_home_work.star_count
     *
     * @mbg.generated
     */
    public Integer getStarCount() {
        return starCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ld_home_work.star_count
     *
     * @param starCount the value for ld_home_work.star_count
     *
     * @mbg.generated
     */
    public void setStarCount(Integer starCount) {
        this.starCount = starCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ld_home_work.negative_count
     *
     * @return the value of ld_home_work.negative_count
     *
     * @mbg.generated
     */
    public Integer getNegativeCount() {
        return negativeCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ld_home_work.negative_count
     *
     * @param negativeCount the value for ld_home_work.negative_count
     *
     * @mbg.generated
     */
    public void setNegativeCount(Integer negativeCount) {
        this.negativeCount = negativeCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ld_home_work.best_flag
     *
     * @return the value of ld_home_work.best_flag
     *
     * @mbg.generated
     */
    public Integer getBestFlag() {
        return bestFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ld_home_work.best_flag
     *
     * @param bestFlag the value for ld_home_work.best_flag
     *
     * @mbg.generated
     */
    public void setBestFlag(Integer bestFlag) {
        this.bestFlag = bestFlag;
    }
}