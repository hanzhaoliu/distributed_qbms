package cn.qtech.domain;

public class Subject {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subject.subject_id
     *
     * @mbggenerated Thu Mar 23 17:14:14 CST 2017
     */
    private String subjectId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subject.name
     *
     * @mbggenerated Thu Mar 23 17:14:14 CST 2017
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subject.description
     *
     * @mbggenerated Thu Mar 23 17:14:14 CST 2017
     */
    private String description;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subject.subject_category_id
     *
     * @mbggenerated Thu Mar 23 17:14:14 CST 2017
     */
    private String subjectCategoryId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subject.user_id
     *
     * @mbggenerated Thu Mar 23 17:14:14 CST 2017
     */
    private String userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subject.subject_difficulty_id
     *
     * @mbggenerated Thu Mar 23 17:14:14 CST 2017
     */
    private String subjectDifficultyId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subject.subject_id
     *
     * @return the value of subject.subject_id
     *
     * @mbggenerated Thu Mar 23 17:14:14 CST 2017
     */
    public String getSubjectId() {
        return subjectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subject.subject_id
     *
     * @param subjectId the value for subject.subject_id
     *
     * @mbggenerated Thu Mar 23 17:14:14 CST 2017
     */
    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId == null ? null : subjectId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subject.name
     *
     * @return the value of subject.name
     *
     * @mbggenerated Thu Mar 23 17:14:14 CST 2017
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subject.name
     *
     * @param name the value for subject.name
     *
     * @mbggenerated Thu Mar 23 17:14:14 CST 2017
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subject.description
     *
     * @return the value of subject.description
     *
     * @mbggenerated Thu Mar 23 17:14:14 CST 2017
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subject.description
     *
     * @param description the value for subject.description
     *
     * @mbggenerated Thu Mar 23 17:14:14 CST 2017
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subject.subject_category_id
     *
     * @return the value of subject.subject_category_id
     *
     * @mbggenerated Thu Mar 23 17:14:14 CST 2017
     */
    public String getSubjectCategoryId() {
        return subjectCategoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subject.subject_category_id
     *
     * @param subjectCategoryId the value for subject.subject_category_id
     *
     * @mbggenerated Thu Mar 23 17:14:14 CST 2017
     */
    public void setSubjectCategoryId(String subjectCategoryId) {
        this.subjectCategoryId = subjectCategoryId == null ? null : subjectCategoryId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subject.user_id
     *
     * @return the value of subject.user_id
     *
     * @mbggenerated Thu Mar 23 17:14:14 CST 2017
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subject.user_id
     *
     * @param userId the value for subject.user_id
     *
     * @mbggenerated Thu Mar 23 17:14:14 CST 2017
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subject.subject_difficulty_id
     *
     * @return the value of subject.subject_difficulty_id
     *
     * @mbggenerated Thu Mar 23 17:14:14 CST 2017
     */
    public String getSubjectDifficultyId() {
        return subjectDifficultyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subject.subject_difficulty_id
     *
     * @param subjectDifficultyId the value for subject.subject_difficulty_id
     *
     * @mbggenerated Thu Mar 23 17:14:14 CST 2017
     */
    public void setSubjectDifficultyId(String subjectDifficultyId) {
        this.subjectDifficultyId = subjectDifficultyId == null ? null : subjectDifficultyId.trim();
    }
}