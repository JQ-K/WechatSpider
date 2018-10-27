package com.wechat.auto.model;

import javax.persistence.criteria.CriteriaBuilder;

public class PostKeyword {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column keywordTable.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column keywordTable.wordtext
     *
     * @mbggenerated
     */
    private String wordtext;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column keywordTable.wordfrequency
     *
     * @mbggenerated
     */
    private Integer wordfrequency;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column keywordTable.wordtype
     *
     * @mbggenerated
     */
    private Integer wordtype;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table keywordTable
     *
     * @mbggenerated
     */
    public PostKeyword(Integer id, String wordtext, Integer wordfrequency, Integer wordtype) {
        this.id = id;
        this.wordtext = wordtext;
        this.wordfrequency = wordfrequency;
        this.wordtype = wordtype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column keywordTable.id
     *
     * @return the value of keywordTable.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column keywordTable.wordtext
     *
     * @return the value of keywordTable.wordtext
     *
     * @mbggenerated
     */
    public String getWordtext() {
        return wordtext;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column keywordTable.wordfrequency
     *
     * @return the value of keywordTable.wordfrequency
     *
     * @mbggenerated
     */
    public Integer getWordfrequency() {
        return wordfrequency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column keywordTable.wordtype
     *
     * @return the value of keywordTable.wordtype
     *
     * @mbggenerated
     */
    public Integer getWordtype() {
        return wordtype;
    }


    public void setWeight(Integer wordfrequency){
        this.wordfrequency = wordfrequency;
    }
}