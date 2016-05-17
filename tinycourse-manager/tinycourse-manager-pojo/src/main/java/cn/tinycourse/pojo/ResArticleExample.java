package cn.tinycourse.pojo;

import java.util.ArrayList;
import java.util.List;

public class ResArticleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ResArticleExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andResArtIdIsNull() {
            addCriterion("res_art_id is null");
            return (Criteria) this;
        }

        public Criteria andResArtIdIsNotNull() {
            addCriterion("res_art_id is not null");
            return (Criteria) this;
        }

        public Criteria andResArtIdEqualTo(Integer value) {
            addCriterion("res_art_id =", value, "resArtId");
            return (Criteria) this;
        }

        public Criteria andResArtIdNotEqualTo(Integer value) {
            addCriterion("res_art_id <>", value, "resArtId");
            return (Criteria) this;
        }

        public Criteria andResArtIdGreaterThan(Integer value) {
            addCriterion("res_art_id >", value, "resArtId");
            return (Criteria) this;
        }

        public Criteria andResArtIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("res_art_id >=", value, "resArtId");
            return (Criteria) this;
        }

        public Criteria andResArtIdLessThan(Integer value) {
            addCriterion("res_art_id <", value, "resArtId");
            return (Criteria) this;
        }

        public Criteria andResArtIdLessThanOrEqualTo(Integer value) {
            addCriterion("res_art_id <=", value, "resArtId");
            return (Criteria) this;
        }

        public Criteria andResArtIdIn(List<Integer> values) {
            addCriterion("res_art_id in", values, "resArtId");
            return (Criteria) this;
        }

        public Criteria andResArtIdNotIn(List<Integer> values) {
            addCriterion("res_art_id not in", values, "resArtId");
            return (Criteria) this;
        }

        public Criteria andResArtIdBetween(Integer value1, Integer value2) {
            addCriterion("res_art_id between", value1, value2, "resArtId");
            return (Criteria) this;
        }

        public Criteria andResArtIdNotBetween(Integer value1, Integer value2) {
            addCriterion("res_art_id not between", value1, value2, "resArtId");
            return (Criteria) this;
        }

        public Criteria andResIdIsNull() {
            addCriterion("res_id is null");
            return (Criteria) this;
        }

        public Criteria andResIdIsNotNull() {
            addCriterion("res_id is not null");
            return (Criteria) this;
        }

        public Criteria andResIdEqualTo(Integer value) {
            addCriterion("res_id =", value, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdNotEqualTo(Integer value) {
            addCriterion("res_id <>", value, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdGreaterThan(Integer value) {
            addCriterion("res_id >", value, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("res_id >=", value, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdLessThan(Integer value) {
            addCriterion("res_id <", value, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdLessThanOrEqualTo(Integer value) {
            addCriterion("res_id <=", value, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdIn(List<Integer> values) {
            addCriterion("res_id in", values, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdNotIn(List<Integer> values) {
            addCriterion("res_id not in", values, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdBetween(Integer value1, Integer value2) {
            addCriterion("res_id between", value1, value2, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdNotBetween(Integer value1, Integer value2) {
            addCriterion("res_id not between", value1, value2, "resId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andResArtTitleIsNull() {
            addCriterion("res_art_title is null");
            return (Criteria) this;
        }

        public Criteria andResArtTitleIsNotNull() {
            addCriterion("res_art_title is not null");
            return (Criteria) this;
        }

        public Criteria andResArtTitleEqualTo(String value) {
            addCriterion("res_art_title =", value, "resArtTitle");
            return (Criteria) this;
        }

        public Criteria andResArtTitleNotEqualTo(String value) {
            addCriterion("res_art_title <>", value, "resArtTitle");
            return (Criteria) this;
        }

        public Criteria andResArtTitleGreaterThan(String value) {
            addCriterion("res_art_title >", value, "resArtTitle");
            return (Criteria) this;
        }

        public Criteria andResArtTitleGreaterThanOrEqualTo(String value) {
            addCriterion("res_art_title >=", value, "resArtTitle");
            return (Criteria) this;
        }

        public Criteria andResArtTitleLessThan(String value) {
            addCriterion("res_art_title <", value, "resArtTitle");
            return (Criteria) this;
        }

        public Criteria andResArtTitleLessThanOrEqualTo(String value) {
            addCriterion("res_art_title <=", value, "resArtTitle");
            return (Criteria) this;
        }

        public Criteria andResArtTitleLike(String value) {
            addCriterion("res_art_title like", value, "resArtTitle");
            return (Criteria) this;
        }

        public Criteria andResArtTitleNotLike(String value) {
            addCriterion("res_art_title not like", value, "resArtTitle");
            return (Criteria) this;
        }

        public Criteria andResArtTitleIn(List<String> values) {
            addCriterion("res_art_title in", values, "resArtTitle");
            return (Criteria) this;
        }

        public Criteria andResArtTitleNotIn(List<String> values) {
            addCriterion("res_art_title not in", values, "resArtTitle");
            return (Criteria) this;
        }

        public Criteria andResArtTitleBetween(String value1, String value2) {
            addCriterion("res_art_title between", value1, value2, "resArtTitle");
            return (Criteria) this;
        }

        public Criteria andResArtTitleNotBetween(String value1, String value2) {
            addCriterion("res_art_title not between", value1, value2, "resArtTitle");
            return (Criteria) this;
        }

        public Criteria andResArtContentIsNull() {
            addCriterion("res_art_content is null");
            return (Criteria) this;
        }

        public Criteria andResArtContentIsNotNull() {
            addCriterion("res_art_content is not null");
            return (Criteria) this;
        }

        public Criteria andResArtContentEqualTo(String value) {
            addCriterion("res_art_content =", value, "resArtContent");
            return (Criteria) this;
        }

        public Criteria andResArtContentNotEqualTo(String value) {
            addCriterion("res_art_content <>", value, "resArtContent");
            return (Criteria) this;
        }

        public Criteria andResArtContentGreaterThan(String value) {
            addCriterion("res_art_content >", value, "resArtContent");
            return (Criteria) this;
        }

        public Criteria andResArtContentGreaterThanOrEqualTo(String value) {
            addCriterion("res_art_content >=", value, "resArtContent");
            return (Criteria) this;
        }

        public Criteria andResArtContentLessThan(String value) {
            addCriterion("res_art_content <", value, "resArtContent");
            return (Criteria) this;
        }

        public Criteria andResArtContentLessThanOrEqualTo(String value) {
            addCriterion("res_art_content <=", value, "resArtContent");
            return (Criteria) this;
        }

        public Criteria andResArtContentLike(String value) {
            addCriterion("res_art_content like", value, "resArtContent");
            return (Criteria) this;
        }

        public Criteria andResArtContentNotLike(String value) {
            addCriterion("res_art_content not like", value, "resArtContent");
            return (Criteria) this;
        }

        public Criteria andResArtContentIn(List<String> values) {
            addCriterion("res_art_content in", values, "resArtContent");
            return (Criteria) this;
        }

        public Criteria andResArtContentNotIn(List<String> values) {
            addCriterion("res_art_content not in", values, "resArtContent");
            return (Criteria) this;
        }

        public Criteria andResArtContentBetween(String value1, String value2) {
            addCriterion("res_art_content between", value1, value2, "resArtContent");
            return (Criteria) this;
        }

        public Criteria andResArtContentNotBetween(String value1, String value2) {
            addCriterion("res_art_content not between", value1, value2, "resArtContent");
            return (Criteria) this;
        }

        public Criteria andResArtCostIsNull() {
            addCriterion("res_art_cost is null");
            return (Criteria) this;
        }

        public Criteria andResArtCostIsNotNull() {
            addCriterion("res_art_cost is not null");
            return (Criteria) this;
        }

        public Criteria andResArtCostEqualTo(Integer value) {
            addCriterion("res_art_cost =", value, "resArtCost");
            return (Criteria) this;
        }

        public Criteria andResArtCostNotEqualTo(Integer value) {
            addCriterion("res_art_cost <>", value, "resArtCost");
            return (Criteria) this;
        }

        public Criteria andResArtCostGreaterThan(Integer value) {
            addCriterion("res_art_cost >", value, "resArtCost");
            return (Criteria) this;
        }

        public Criteria andResArtCostGreaterThanOrEqualTo(Integer value) {
            addCriterion("res_art_cost >=", value, "resArtCost");
            return (Criteria) this;
        }

        public Criteria andResArtCostLessThan(Integer value) {
            addCriterion("res_art_cost <", value, "resArtCost");
            return (Criteria) this;
        }

        public Criteria andResArtCostLessThanOrEqualTo(Integer value) {
            addCriterion("res_art_cost <=", value, "resArtCost");
            return (Criteria) this;
        }

        public Criteria andResArtCostIn(List<Integer> values) {
            addCriterion("res_art_cost in", values, "resArtCost");
            return (Criteria) this;
        }

        public Criteria andResArtCostNotIn(List<Integer> values) {
            addCriterion("res_art_cost not in", values, "resArtCost");
            return (Criteria) this;
        }

        public Criteria andResArtCostBetween(Integer value1, Integer value2) {
            addCriterion("res_art_cost between", value1, value2, "resArtCost");
            return (Criteria) this;
        }

        public Criteria andResArtCostNotBetween(Integer value1, Integer value2) {
            addCriterion("res_art_cost not between", value1, value2, "resArtCost");
            return (Criteria) this;
        }

        public Criteria andResArtDownloadIsNull() {
            addCriterion("res_art_download is null");
            return (Criteria) this;
        }

        public Criteria andResArtDownloadIsNotNull() {
            addCriterion("res_art_download is not null");
            return (Criteria) this;
        }

        public Criteria andResArtDownloadEqualTo(Integer value) {
            addCriterion("res_art_download =", value, "resArtDownload");
            return (Criteria) this;
        }

        public Criteria andResArtDownloadNotEqualTo(Integer value) {
            addCriterion("res_art_download <>", value, "resArtDownload");
            return (Criteria) this;
        }

        public Criteria andResArtDownloadGreaterThan(Integer value) {
            addCriterion("res_art_download >", value, "resArtDownload");
            return (Criteria) this;
        }

        public Criteria andResArtDownloadGreaterThanOrEqualTo(Integer value) {
            addCriterion("res_art_download >=", value, "resArtDownload");
            return (Criteria) this;
        }

        public Criteria andResArtDownloadLessThan(Integer value) {
            addCriterion("res_art_download <", value, "resArtDownload");
            return (Criteria) this;
        }

        public Criteria andResArtDownloadLessThanOrEqualTo(Integer value) {
            addCriterion("res_art_download <=", value, "resArtDownload");
            return (Criteria) this;
        }

        public Criteria andResArtDownloadIn(List<Integer> values) {
            addCriterion("res_art_download in", values, "resArtDownload");
            return (Criteria) this;
        }

        public Criteria andResArtDownloadNotIn(List<Integer> values) {
            addCriterion("res_art_download not in", values, "resArtDownload");
            return (Criteria) this;
        }

        public Criteria andResArtDownloadBetween(Integer value1, Integer value2) {
            addCriterion("res_art_download between", value1, value2, "resArtDownload");
            return (Criteria) this;
        }

        public Criteria andResArtDownloadNotBetween(Integer value1, Integer value2) {
            addCriterion("res_art_download not between", value1, value2, "resArtDownload");
            return (Criteria) this;
        }

        public Criteria andResArtGradeIsNull() {
            addCriterion("res_art_grade is null");
            return (Criteria) this;
        }

        public Criteria andResArtGradeIsNotNull() {
            addCriterion("res_art_grade is not null");
            return (Criteria) this;
        }

        public Criteria andResArtGradeEqualTo(Integer value) {
            addCriterion("res_art_grade =", value, "resArtGrade");
            return (Criteria) this;
        }

        public Criteria andResArtGradeNotEqualTo(Integer value) {
            addCriterion("res_art_grade <>", value, "resArtGrade");
            return (Criteria) this;
        }

        public Criteria andResArtGradeGreaterThan(Integer value) {
            addCriterion("res_art_grade >", value, "resArtGrade");
            return (Criteria) this;
        }

        public Criteria andResArtGradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("res_art_grade >=", value, "resArtGrade");
            return (Criteria) this;
        }

        public Criteria andResArtGradeLessThan(Integer value) {
            addCriterion("res_art_grade <", value, "resArtGrade");
            return (Criteria) this;
        }

        public Criteria andResArtGradeLessThanOrEqualTo(Integer value) {
            addCriterion("res_art_grade <=", value, "resArtGrade");
            return (Criteria) this;
        }

        public Criteria andResArtGradeIn(List<Integer> values) {
            addCriterion("res_art_grade in", values, "resArtGrade");
            return (Criteria) this;
        }

        public Criteria andResArtGradeNotIn(List<Integer> values) {
            addCriterion("res_art_grade not in", values, "resArtGrade");
            return (Criteria) this;
        }

        public Criteria andResArtGradeBetween(Integer value1, Integer value2) {
            addCriterion("res_art_grade between", value1, value2, "resArtGrade");
            return (Criteria) this;
        }

        public Criteria andResArtGradeNotBetween(Integer value1, Integer value2) {
            addCriterion("res_art_grade not between", value1, value2, "resArtGrade");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}