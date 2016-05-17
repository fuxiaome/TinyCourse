package cn.tinycourse.controller;

import org.springframework.web.multipart.MultipartFile;

public class UserAdd {
	 private Integer userId;

	    private Integer proId;

	    private String userName;

	    private String userPwd;

	    private String userBirthday;

	    private Long userQq;

	    private String userEmail;

	    private Integer userCredit;

	    private String userSex;

	    private String userDate;
	    
	    private MultipartFile userImage;
	    

		public MultipartFile getUserImage() {
			return userImage;
		}

		public void setUserImage(MultipartFile userImage) {
			this.userImage = userImage;
		}

		@Override
		public String toString() {
			return "UserAdd [userId=" + userId + ", proId=" + proId + ", userName=" + userName + ", userPwd=" + userPwd
					+ ", userBirthday=" + userBirthday + ", userQq=" + userQq + ", userEmail=" + userEmail
					+ ", userCredit=" + userCredit + ", userSex=" + userSex + ", userDate=" + userDate + ", userImage="
					+ userImage + "]";
		}

		public Integer getUserId() {
			return userId;
		}

		public void setUserId(Integer userId) {
			this.userId = userId;
		}

		public Integer getProId() {
			return proId;
		}

		public void setProId(Integer proId) {
			this.proId = proId;
		}

		public String getUserName() {
			return userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getUserPwd() {
			return userPwd;
		}

		public void setUserPwd(String userPwd) {
			this.userPwd = userPwd;
		}

		public String getUserBirthday() {
			return userBirthday;
		}

		public void setUserBirthday(String userBirthday) {
			this.userBirthday = userBirthday;
		}

		public Long getUserQq() {
			return userQq;
		}

		public void setUserQq(Long userQq) {
			this.userQq = userQq;
		}

		public String getUserEmail() {
			return userEmail;
		}

		public void setUserEmail(String userEmail) {
			this.userEmail = userEmail;
		}

		public Integer getUserCredit() {
			return userCredit;
		}

		public void setUserCredit(Integer userCredit) {
			this.userCredit = userCredit;
		}

		public String getUserSex() {
			return userSex;
		}

		public void setUserSex(String userSex) {
			this.userSex = userSex;
		}

		public String getUserDate() {
			return userDate;
		}

		public void setUserDate(String userDate) {
			this.userDate = userDate;
		}

}
