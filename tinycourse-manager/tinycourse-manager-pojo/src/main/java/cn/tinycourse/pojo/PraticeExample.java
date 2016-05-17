package cn.tinycourse.pojo;

import java.util.ArrayList;
import java.util.List;

public class PraticeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PraticeExample() {
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

        public Criteria andPraIdIsNull() {
            addCriterion("pra_id is null");
            return (Criteria) this;
        }

        public Criteria andPraIdIsNotNull() {
            addCriterion("pra_id is not null");
            return (Criteria) this;
        }

        public Criteria andPraIdEqualTo(Integer value) {
            addCriterion("pra_id =", value, "praId");
            return (Criteria) this;
        }

        public Criteria andPraIdNotEqualTo(Integer value) {
            addCriterion("pra_id <>", value, "praId");
            return (Criteria) this;
        }

        public Criteria andPraIdGreaterThan(Integer value) {
            addCriterion("pra_id >", value, "praId");
            return (Criteria) this;
        }

        public Criteria andPraIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pra_id >=", value, "praId");
            return (Criteria) this;
        }

        public Criteria andPraIdLessThan(Integer value) {
            addCriterion("pra_id <", value, "praId");
            return (Criteria) this;
        }

        public Criteria andPraIdLessThanOrEqualTo(Integer value) {
            addCriterion("pra_id <=", value, "praId");
            return (Criteria) this;
        }

        public Criteria andPraIdIn(List<Integer> values) {
            addCriterion("pra_id in", values, "praId");
            return (Criteria) this;
        }

        public Criteria andPraIdNotIn(List<Integer> values) {
            addCriterion("pra_id not in", values, "praId");
            return (Criteria) this;
        }

        public Criteria andPraIdBetween(Integer value1, Integer value2) {
            addCriterion("pra_id between", value1, value2, "praId");
            return (Criteria) this;
        }

        public Criteria andPraIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pra_id not between", value1, value2, "praId");
            return (Criteria) this;
        }

        public Criteria andVidIdIsNull() {
            addCriterion("vid_id is null");
            return (Criteria) this;
        }

        public Criteria andVidIdIsNotNull() {
            addCriterion("vid_id is not null");
            return (Criteria) this;
        }

        public Criteria andVidIdEqualTo(Integer value) {
            addCriterion("vid_id =", value, "vidId");
            return (Criteria) this;
        }

        public Criteria andVidIdNotEqualTo(Integer value) {
            addCriterion("vid_id <>", value, "vidId");
            return (Criteria) this;
        }

        public Criteria andVidIdGreaterThan(Integer value) {
            addCriterion("vid_id >", value, "vidId");
            return (Criteria) this;
        }

        public Criteria andVidIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("vid_id >=", value, "vidId");
            return (Criteria) this;
        }

        public Criteria andVidIdLessThan(Integer value) {
            addCriterion("vid_id <", value, "vidId");
            return (Criteria) this;
        }

        public Criteria andVidIdLessThanOrEqualTo(Integer value) {
            addCriterion("vid_id <=", value, "vidId");
            return (Criteria) this;
        }

        public Criteria andVidIdIn(List<Integer> values) {
            addCriterion("vid_id in", values, "vidId");
            return (Criteria) this;
        }

        public Criteria andVidIdNotIn(List<Integer> values) {
            addCriterion("vid_id not in", values, "vidId");
            return (Criteria) this;
        }

        public Criteria andVidIdBetween(Integer value1, Integer value2) {
            addCriterion("vid_id between", value1, value2, "vidId");
            return (Criteria) this;
        }

        public Criteria andVidIdNotBetween(Integer value1, Integer value2) {
            addCriterion("vid_id not between", value1, value2, "vidId");
            return (Criteria) this;
        }

        public Criteria andPraQuestionIsNull() {
            addCriterion("pra_question is null");
            return (Criteria) this;
        }

        public Criteria andPraQuestionIsNotNull() {
            addCriterion("pra_question is not null");
            return (Criteria) this;
        }

        public Criteria andPraQuestionEqualTo(String value) {
            addCriterion("pra_question =", value, "praQuestion");
            return (Criteria) this;
        }

        public Criteria andPraQuestionNotEqualTo(String value) {
            addCriterion("pra_question <>", value, "praQuestion");
            return (Criteria) this;
        }

        public Criteria andPraQuestionGreaterThan(String value) {
            addCriterion("pra_question >", value, "praQuestion");
            return (Criteria) this;
        }

        public Criteria andPraQuestionGreaterThanOrEqualTo(String value) {
            addCriterion("pra_question >=", value, "praQuestion");
            return (Criteria) this;
        }

        public Criteria andPraQuestionLessThan(String value) {
            addCriterion("pra_question <", value, "praQuestion");
            return (Criteria) this;
        }

        public Criteria andPraQuestionLessThanOrEqualTo(String value) {
            addCriterion("pra_question <=", value, "praQuestion");
            return (Criteria) this;
        }

        public Criteria andPraQuestionLike(String value) {
            addCriterion("pra_question like", value, "praQuestion");
            return (Criteria) this;
        }

        public Criteria andPraQuestionNotLike(String value) {
            addCriterion("pra_question not like", value, "praQuestion");
            return (Criteria) this;
        }

        public Criteria andPraQuestionIn(List<String> values) {
            addCriterion("pra_question in", values, "praQuestion");
            return (Criteria) this;
        }

        public Criteria andPraQuestionNotIn(List<String> values) {
            addCriterion("pra_question not in", values, "praQuestion");
            return (Criteria) this;
        }

        public Criteria andPraQuestionBetween(String value1, String value2) {
            addCriterion("pra_question between", value1, value2, "praQuestion");
            return (Criteria) this;
        }

        public Criteria andPraQuestionNotBetween(String value1, String value2) {
            addCriterion("pra_question not between", value1, value2, "praQuestion");
            return (Criteria) this;
        }

        public Criteria andPraOptionaIsNull() {
            addCriterion("pra_optiona is null");
            return (Criteria) this;
        }

        public Criteria andPraOptionaIsNotNull() {
            addCriterion("pra_optiona is not null");
            return (Criteria) this;
        }

        public Criteria andPraOptionaEqualTo(String value) {
            addCriterion("pra_optiona =", value, "praOptiona");
            return (Criteria) this;
        }

        public Criteria andPraOptionaNotEqualTo(String value) {
            addCriterion("pra_optiona <>", value, "praOptiona");
            return (Criteria) this;
        }

        public Criteria andPraOptionaGreaterThan(String value) {
            addCriterion("pra_optiona >", value, "praOptiona");
            return (Criteria) this;
        }

        public Criteria andPraOptionaGreaterThanOrEqualTo(String value) {
            addCriterion("pra_optiona >=", value, "praOptiona");
            return (Criteria) this;
        }

        public Criteria andPraOptionaLessThan(String value) {
            addCriterion("pra_optiona <", value, "praOptiona");
            return (Criteria) this;
        }

        public Criteria andPraOptionaLessThanOrEqualTo(String value) {
            addCriterion("pra_optiona <=", value, "praOptiona");
            return (Criteria) this;
        }

        public Criteria andPraOptionaLike(String value) {
            addCriterion("pra_optiona like", value, "praOptiona");
            return (Criteria) this;
        }

        public Criteria andPraOptionaNotLike(String value) {
            addCriterion("pra_optiona not like", value, "praOptiona");
            return (Criteria) this;
        }

        public Criteria andPraOptionaIn(List<String> values) {
            addCriterion("pra_optiona in", values, "praOptiona");
            return (Criteria) this;
        }

        public Criteria andPraOptionaNotIn(List<String> values) {
            addCriterion("pra_optiona not in", values, "praOptiona");
            return (Criteria) this;
        }

        public Criteria andPraOptionaBetween(String value1, String value2) {
            addCriterion("pra_optiona between", value1, value2, "praOptiona");
            return (Criteria) this;
        }

        public Criteria andPraOptionaNotBetween(String value1, String value2) {
            addCriterion("pra_optiona not between", value1, value2, "praOptiona");
            return (Criteria) this;
        }

        public Criteria andPraOptionbIsNull() {
            addCriterion("pra_optionb is null");
            return (Criteria) this;
        }

        public Criteria andPraOptionbIsNotNull() {
            addCriterion("pra_optionb is not null");
            return (Criteria) this;
        }

        public Criteria andPraOptionbEqualTo(String value) {
            addCriterion("pra_optionb =", value, "praOptionb");
            return (Criteria) this;
        }

        public Criteria andPraOptionbNotEqualTo(String value) {
            addCriterion("pra_optionb <>", value, "praOptionb");
            return (Criteria) this;
        }

        public Criteria andPraOptionbGreaterThan(String value) {
            addCriterion("pra_optionb >", value, "praOptionb");
            return (Criteria) this;
        }

        public Criteria andPraOptionbGreaterThanOrEqualTo(String value) {
            addCriterion("pra_optionb >=", value, "praOptionb");
            return (Criteria) this;
        }

        public Criteria andPraOptionbLessThan(String value) {
            addCriterion("pra_optionb <", value, "praOptionb");
            return (Criteria) this;
        }

        public Criteria andPraOptionbLessThanOrEqualTo(String value) {
            addCriterion("pra_optionb <=", value, "praOptionb");
            return (Criteria) this;
        }

        public Criteria andPraOptionbLike(String value) {
            addCriterion("pra_optionb like", value, "praOptionb");
            return (Criteria) this;
        }

        public Criteria andPraOptionbNotLike(String value) {
            addCriterion("pra_optionb not like", value, "praOptionb");
            return (Criteria) this;
        }

        public Criteria andPraOptionbIn(List<String> values) {
            addCriterion("pra_optionb in", values, "praOptionb");
            return (Criteria) this;
        }

        public Criteria andPraOptionbNotIn(List<String> values) {
            addCriterion("pra_optionb not in", values, "praOptionb");
            return (Criteria) this;
        }

        public Criteria andPraOptionbBetween(String value1, String value2) {
            addCriterion("pra_optionb between", value1, value2, "praOptionb");
            return (Criteria) this;
        }

        public Criteria andPraOptionbNotBetween(String value1, String value2) {
            addCriterion("pra_optionb not between", value1, value2, "praOptionb");
            return (Criteria) this;
        }

        public Criteria andPraOptioncIsNull() {
            addCriterion("pra_optionc is null");
            return (Criteria) this;
        }

        public Criteria andPraOptioncIsNotNull() {
            addCriterion("pra_optionc is not null");
            return (Criteria) this;
        }

        public Criteria andPraOptioncEqualTo(String value) {
            addCriterion("pra_optionc =", value, "praOptionc");
            return (Criteria) this;
        }

        public Criteria andPraOptioncNotEqualTo(String value) {
            addCriterion("pra_optionc <>", value, "praOptionc");
            return (Criteria) this;
        }

        public Criteria andPraOptioncGreaterThan(String value) {
            addCriterion("pra_optionc >", value, "praOptionc");
            return (Criteria) this;
        }

        public Criteria andPraOptioncGreaterThanOrEqualTo(String value) {
            addCriterion("pra_optionc >=", value, "praOptionc");
            return (Criteria) this;
        }

        public Criteria andPraOptioncLessThan(String value) {
            addCriterion("pra_optionc <", value, "praOptionc");
            return (Criteria) this;
        }

        public Criteria andPraOptioncLessThanOrEqualTo(String value) {
            addCriterion("pra_optionc <=", value, "praOptionc");
            return (Criteria) this;
        }

        public Criteria andPraOptioncLike(String value) {
            addCriterion("pra_optionc like", value, "praOptionc");
            return (Criteria) this;
        }

        public Criteria andPraOptioncNotLike(String value) {
            addCriterion("pra_optionc not like", value, "praOptionc");
            return (Criteria) this;
        }

        public Criteria andPraOptioncIn(List<String> values) {
            addCriterion("pra_optionc in", values, "praOptionc");
            return (Criteria) this;
        }

        public Criteria andPraOptioncNotIn(List<String> values) {
            addCriterion("pra_optionc not in", values, "praOptionc");
            return (Criteria) this;
        }

        public Criteria andPraOptioncBetween(String value1, String value2) {
            addCriterion("pra_optionc between", value1, value2, "praOptionc");
            return (Criteria) this;
        }

        public Criteria andPraOptioncNotBetween(String value1, String value2) {
            addCriterion("pra_optionc not between", value1, value2, "praOptionc");
            return (Criteria) this;
        }

        public Criteria andPraOptiondIsNull() {
            addCriterion("pra_optiond is null");
            return (Criteria) this;
        }

        public Criteria andPraOptiondIsNotNull() {
            addCriterion("pra_optiond is not null");
            return (Criteria) this;
        }

        public Criteria andPraOptiondEqualTo(String value) {
            addCriterion("pra_optiond =", value, "praOptiond");
            return (Criteria) this;
        }

        public Criteria andPraOptiondNotEqualTo(String value) {
            addCriterion("pra_optiond <>", value, "praOptiond");
            return (Criteria) this;
        }

        public Criteria andPraOptiondGreaterThan(String value) {
            addCriterion("pra_optiond >", value, "praOptiond");
            return (Criteria) this;
        }

        public Criteria andPraOptiondGreaterThanOrEqualTo(String value) {
            addCriterion("pra_optiond >=", value, "praOptiond");
            return (Criteria) this;
        }

        public Criteria andPraOptiondLessThan(String value) {
            addCriterion("pra_optiond <", value, "praOptiond");
            return (Criteria) this;
        }

        public Criteria andPraOptiondLessThanOrEqualTo(String value) {
            addCriterion("pra_optiond <=", value, "praOptiond");
            return (Criteria) this;
        }

        public Criteria andPraOptiondLike(String value) {
            addCriterion("pra_optiond like", value, "praOptiond");
            return (Criteria) this;
        }

        public Criteria andPraOptiondNotLike(String value) {
            addCriterion("pra_optiond not like", value, "praOptiond");
            return (Criteria) this;
        }

        public Criteria andPraOptiondIn(List<String> values) {
            addCriterion("pra_optiond in", values, "praOptiond");
            return (Criteria) this;
        }

        public Criteria andPraOptiondNotIn(List<String> values) {
            addCriterion("pra_optiond not in", values, "praOptiond");
            return (Criteria) this;
        }

        public Criteria andPraOptiondBetween(String value1, String value2) {
            addCriterion("pra_optiond between", value1, value2, "praOptiond");
            return (Criteria) this;
        }

        public Criteria andPraOptiondNotBetween(String value1, String value2) {
            addCriterion("pra_optiond not between", value1, value2, "praOptiond");
            return (Criteria) this;
        }

        public Criteria andPraRightIsNull() {
            addCriterion("pra_right is null");
            return (Criteria) this;
        }

        public Criteria andPraRightIsNotNull() {
            addCriterion("pra_right is not null");
            return (Criteria) this;
        }

        public Criteria andPraRightEqualTo(Integer value) {
            addCriterion("pra_right =", value, "praRight");
            return (Criteria) this;
        }

        public Criteria andPraRightNotEqualTo(Integer value) {
            addCriterion("pra_right <>", value, "praRight");
            return (Criteria) this;
        }

        public Criteria andPraRightGreaterThan(Integer value) {
            addCriterion("pra_right >", value, "praRight");
            return (Criteria) this;
        }

        public Criteria andPraRightGreaterThanOrEqualTo(Integer value) {
            addCriterion("pra_right >=", value, "praRight");
            return (Criteria) this;
        }

        public Criteria andPraRightLessThan(Integer value) {
            addCriterion("pra_right <", value, "praRight");
            return (Criteria) this;
        }

        public Criteria andPraRightLessThanOrEqualTo(Integer value) {
            addCriterion("pra_right <=", value, "praRight");
            return (Criteria) this;
        }

        public Criteria andPraRightIn(List<Integer> values) {
            addCriterion("pra_right in", values, "praRight");
            return (Criteria) this;
        }

        public Criteria andPraRightNotIn(List<Integer> values) {
            addCriterion("pra_right not in", values, "praRight");
            return (Criteria) this;
        }

        public Criteria andPraRightBetween(Integer value1, Integer value2) {
            addCriterion("pra_right between", value1, value2, "praRight");
            return (Criteria) this;
        }

        public Criteria andPraRightNotBetween(Integer value1, Integer value2) {
            addCriterion("pra_right not between", value1, value2, "praRight");
            return (Criteria) this;
        }

        public Criteria andPraOrderIsNull() {
            addCriterion("pra_order is null");
            return (Criteria) this;
        }

        public Criteria andPraOrderIsNotNull() {
            addCriterion("pra_order is not null");
            return (Criteria) this;
        }

        public Criteria andPraOrderEqualTo(Integer value) {
            addCriterion("pra_order =", value, "praOrder");
            return (Criteria) this;
        }

        public Criteria andPraOrderNotEqualTo(Integer value) {
            addCriterion("pra_order <>", value, "praOrder");
            return (Criteria) this;
        }

        public Criteria andPraOrderGreaterThan(Integer value) {
            addCriterion("pra_order >", value, "praOrder");
            return (Criteria) this;
        }

        public Criteria andPraOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("pra_order >=", value, "praOrder");
            return (Criteria) this;
        }

        public Criteria andPraOrderLessThan(Integer value) {
            addCriterion("pra_order <", value, "praOrder");
            return (Criteria) this;
        }

        public Criteria andPraOrderLessThanOrEqualTo(Integer value) {
            addCriterion("pra_order <=", value, "praOrder");
            return (Criteria) this;
        }

        public Criteria andPraOrderIn(List<Integer> values) {
            addCriterion("pra_order in", values, "praOrder");
            return (Criteria) this;
        }

        public Criteria andPraOrderNotIn(List<Integer> values) {
            addCriterion("pra_order not in", values, "praOrder");
            return (Criteria) this;
        }

        public Criteria andPraOrderBetween(Integer value1, Integer value2) {
            addCriterion("pra_order between", value1, value2, "praOrder");
            return (Criteria) this;
        }

        public Criteria andPraOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("pra_order not between", value1, value2, "praOrder");
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