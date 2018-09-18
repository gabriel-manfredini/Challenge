package com.reclameaqui.api.documents;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Complain {

		@Id
		private String id;
		private String title;
		private String description;
		private String locale;
		private String company;
		
		public Complain() {
			
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			id = id;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			title = title;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			description = description;
		}

		public String getLocale() {
			return locale;
		}

		public void setLocale(String locale) {
			locale = locale;
		}

		public String getCompany() {
			return company;
		}

		public void setCompany(String company) {
			company = company;
		}
}
