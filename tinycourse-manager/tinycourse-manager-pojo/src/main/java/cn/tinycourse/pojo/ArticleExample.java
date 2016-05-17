package cn.tinycourse.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ArticleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ArticleExample() {
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

        public Criteria andArtIdIsNull() {
            addCriterion("art_id is null");
            return (Criteria) this;
        }

        public Criteria andArtIdIsNotNull() {
            addCriterion("art_id is not null");
            return (Criteria) this;
        }

        public Criteria andArtIdEqualTo(Integer value) {
            addCriterion("art_id =", value, "artId");
            return (Criteria) this;
        }

        public Criteria andArtIdNotEqualTo(Integer value) {
            addCriterion("art_id <>", value, "artId");
            return (Criteria) this;
        }

        public Criteria andArtIdGreaterThan(Integer value) {
            addCriterion("art_id >", value, "artId");
            return (Criteria) this;
        }

        public Criteria andArtIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("art_id >=", value, "artId");
            return (Criteria) this;
        }

        public Criteria andArtIdLessThan(Integer value) {
            addCriterion("art_id <", value, "artId");
            return (Criteria) this;
        }

        public Criteria andArtIdLessThanOrEqualTo(Integer value) {
            addCriterion("art_id <=", value, "artId");
            return (Criteria) this;
        }

        public Criteria andArtIdIn(List<Integer> values) {
            addCriterion("art_id in", values, "artId");
            return (Criteria) this;
        }

        public Criteria andArtIdNotIn(List<Integer> values) {
            addCriterion("art_id not in", values, "artId");
            return (Criteria) this;
        }

        public Criteria andArtIdBetween(Integer value1, Integer value2) {
            addCriterion("art_id between", value1, value2, "artId");
            return (Criteria) this;
        }

        public Criteria andArtIdNotBetween(Integer value1, Integer value2) {
            addCriterion("art_id not between", value1, value2, "artId");
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

        public Criteria andArtTitleIsNull() {
            addCriterion("art_title is null");
            return (Criteria) this;
        }

        public Criteria andArtTitleIsNotNull() {
            addCriterion("art_title is not null");
            return (Criteria) this;
        }

        public Criteria andArtTitleEqualTo(String value) {
            addCriterion("art_title =", value, "artTitle");
            return (Criteria) this;
        }

        public Criteria andArtTitleNotEqualTo(String value) {
            addCriterion("art_title <>", value, "artTitle");
            return (Criteria) this;
        }

        public Criteria andArtTitleGreaterThan(String value) {
            addCriterion("art_title >", value, "artTitle");
            return (Criteria) this;
        }

        public Criteria andArtTitleGreaterThanOrEqualTo(String value) {
            addCriterion("art_title >=", value, "artTitle");
            return (Criteria) this;
        }

        public Criteria andArtTitleLessThan(String value) {
            addCriterion("art_title <", value, "artTitle");
            return (Criteria) this;
        }

        public Criteria andArtTitleLessThanOrEqualTo(String value) {
            addCriterion("art_title <=", value, "artTitle");
            return (Criteria) this;
        }

        public Criteria andArtTitleLike(String value) {
            addCriterion("art_title like", value, "artTitle");
            return (Criteria) this;
        }

        public Criteria andArtTitleNotLike(String value) {
            addCriterion("art_title not like", value, "artTitle");
            return (Criteria) this;
        }

        public Criteria andArtTitleIn(List<String> values) {
            addCriterion("art_title in", values, "artTitle");
            return (Criteria) this;
        }

        public Criteria andArtTitleNotIn(List<String> values) {
            addCriterion("art_title not in", values, "artTitle");
            return (Criteria) this;
        }

        public Criteria andArtTitleBetween(String value1, String value2) {
            addCriterion("art_title between", value1, value2, "artTitle");
            return (Criteria) this;
        }

        public Criteria andArtTitleNotBetween(String value1, String value2) {
            addCriterion("art_title not between", value1, value2, "artTitle");
            return (Criteria) this;
        }

        public Criteria andArtContentIsNull() {
            addCriterion("art_content is null");
            return (Criteria) this;
        }

        public Criteria andArtContentIsNotNull() {
            addCriterion("art_content is not null");
            return (Criteria) this;
        }

        public Criteria andArtContentEqualTo(String value) {
            addCriterion("art_content =", value, "artContent");
            return (Criteria) this;
        }

        public Criteria andArtContentNotEqualTo(String value) {
            addCriterion("art_content <>", value, "artContent");
            return (Criteria) this;
        }

        public Criteria andArtContentGreaterThan(String value) {
            addCriterion("art_content >", value, "artContent");
            return (Criteria) this;
        }

        public Criteria andArtContentGreaterThanOrEqualTo(String value) {
            addCriterion("art_content >=", value, "artContent");
            return (Criteria) this;
        }

        public Criteria andArtContentLessThan(String value) {
            addCriterion("art_content <", value, "artContent");
            return (Criteria) this;
        }

        public Criteria andArtContentLessThanOrEqualTo(String value) {
            addCriterion("art_content <=", value, "artContent");
            return (Criteria) this;
        }

        public Criteria andArtContentLike(String value) {
            addCriterion("art_content like", value, "artContent");
            return (Criteria) this;
        }

        public Criteria andArtContentNotLike(String value) {
            addCriterion("art_content not like", value, "artContent");
            return (Criteria) this;
        }

        public Criteria andArtContentIn(List<String> values) {
            addCriterion("art_content in", values, "artContent");
            return (Criteria) this;
        }

        public Criteria andArtContentNotIn(List<String> values) {
            addCriterion("art_content not in", values, "artContent");
            return (Criteria) this;
        }

        public Criteria andArtContentBetween(String value1, String value2) {
            addCriterion("art_content between", value1, value2, "artContent");
            return (Criteria) this;
        }

        public Criteria andArtContentNotBetween(String value1, String value2) {
            addCriterion("art_content not between", value1, value2, "artContent");
            return (Criteria) this;
        }

        public Criteria andArtLikeIsNull() {
            addCriterion("art_like is null");
            return (Criteria) this;
        }

        public Criteria andArtLikeIsNotNull() {
            addCriterion("art_like is not null");
            return (Criteria) this;
        }

        public Criteria andArtLikeEqualTo(Integer value) {
            addCriterion("art_like =", value, "artLike");
            return (Criteria) this;
        }

        public Criteria andArtLikeNotEqualTo(Integer value) {
            addCriterion("art_like <>", value, "artLike");
            return (Criteria) this;
        }

        public Criteria andArtLikeGreaterThan(Integer value) {
            addCriterion("art_like >", value, "artLike");
            return (Criteria) this;
        }

        public Criteria andArtLikeGreaterThanOrEqualTo(Integer value) {
            addCriterion("art_like >=", value, "artLike");
            return (Criteria) this;
        }

        public Criteria andArtLikeLessThan(Integer value) {
            addCriterion("art_like <", value, "artLike");
            return (Criteria) this;
        }

        public Criteria andArtLikeLessThanOrEqualTo(Integer value) {
            addCriterion("art_like <=", value, "artLike");
            return (Criteria) this;
        }

        public Criteria andArtLikeIn(List<Integer> values) {
            addCriterion("art_like in", values, "artLike");
            return (Criteria) this;
        }

        public Criteria andArtLikeNotIn(List<Integer> values) {
            addCriterion("art_like not in", values, "artLike");
            return (Criteria) this;
        }

        public Criteria andArtLikeBetween(Integer value1, Integer value2) {
            addCriterion("art_like between", value1, value2, "artLike");
            return (Criteria) this;
        }

        public Criteria andArtLikeNotBetween(Integer value1, Integer value2) {
            addCriterion("art_like not between", value1, value2, "artLike");
            return (Criteria) this;
        }

        public Criteria andArtPubdateIsNull() {
            addCriterion("art_pubdate is null");
            return (Criteria) this;
        }

        public Criteria andArtPubdateIsNotNull() {
            addCriterion("art_pubdate is not null");
            return (Criteria) this;
        }

        public Criteria andArtPubdateEqualTo(Date value) {
            addCriterion("art_pubdate =", value, "artPubdate");
            return (Criteria) this;
        }

        public Criteria andArtPubdateNotEqualTo(Date value) {
            addCriterion("art_pubdate <>", value, "artPubdate");
            return (Criteria) this;
        }

        public Criteria andArtPubdateGreaterThan(Date value) {
            addCriterion("art_pubdate >", value, "artPubdate");
            return (Criteria) this;
        }

        public Criteria andArtPubdateGreaterThanOrEqualTo(Date value) {
            addCriterion("art_pubdate >=", value, "artPubdate");
            return (Criteria) this;
        }

        public Criteria andArtPubdateLessThan(Date value) {
            addCriterion("art_pubdate <", value, "artPubdate");
            return (Criteria) this;
        }

        public Criteria andArtPubdateLessThanOrEqualTo(Date value) {
            addCriterion("art_pubdate <=", value, "artPubdate");
            return (Criteria) this;
        }

        public Criteria andArtPubdateIn(List<Date> values) {
            addCriterion("art_pubdate in", values, "artPubdate");
            return (Criteria) this;
        }

        public Criteria andArtPubdateNotIn(List<Date> values) {
            addCriterion("art_pubdate not in", values, "artPubdate");
            return (Criteria) this;
        }

        public Criteria andArtPubdateBetween(Date value1, Date value2) {
            addCriterion("art_pubdate between", value1, value2, "artPubdate");
            return (Criteria) this;
        }

        public Criteria andArtPubdateNotBetween(Date value1, Date value2) {
            addCriterion("art_pubdate not between", value1, value2, "artPubdate");
            return (Criteria) this;
        }

        public Criteria andArtRepdateIsNull() {
            addCriterion("art_repdate is null");
            return (Criteria) this;
        }

        public Criteria andArtRepdateIsNotNull() {
            addCriterion("art_repdate is not null");
            return (Criteria) this;
        }

        public Criteria andArtRepdateEqualTo(Date value) {
            addCriterion("art_repdate =", value, "artRepdate");
            return (Criteria) this;
        }

        public Criteria andArtRepdateNotEqualTo(Date value) {
            addCriterion("art_repdate <>", value, "artRepdate");
            return (Criteria) this;
        }

        public Criteria andArtRepdateGreaterThan(Date value) {
            addCriterion("art_repdate >", value, "artRepdate");
            return (Criteria) this;
        }

        public Criteria andArtRepdateGreaterThanOrEqualTo(Date value) {
            addCriterion("art_repdate >=", value, "artRepdate");
            return (Criteria) this;
        }

        public Criteria andArtRepdateLessThan(Date value) {
            addCriterion("art_repdate <", value, "artRepdate");
            return (Criteria) this;
        }

        public Criteria andArtRepdateLessThanOrEqualTo(Date value) {
            addCriterion("art_repdate <=", value, "artRepdate");
            return (Criteria) this;
        }

        public Criteria andArtRepdateIn(List<Date> values) {
            addCriterion("art_repdate in", values, "artRepdate");
            return (Criteria) this;
        }

        public Criteria andArtRepdateNotIn(List<Date> values) {
            addCriterion("art_repdate not in", values, "artRepdate");
            return (Criteria) this;
        }

        public Criteria andArtRepdateBetween(Date value1, Date value2) {
            addCriterion("art_repdate between", value1, value2, "artRepdate");
            return (Criteria) this;
        }

        public Criteria andArtRepdateNotBetween(Date value1, Date value2) {
            addCriterion("art_repdate not between", value1, value2, "artRepdate");
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