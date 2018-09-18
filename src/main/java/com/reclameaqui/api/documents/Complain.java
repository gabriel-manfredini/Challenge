package com.reclameaqui.api.documents;

import org.hibernate.validator.constraints.NotEmpty;
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
			this.id = id;
		}

		@NotEmpty(message = "Title can't be empty")
		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}
		
		@NotEmpty(message = "Description can't be empty")
		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		@NotEmpty(message = "Locale can't be empty")
		public String getLocale() {
			return locale;
		}

		public void setLocale(String locale) {
			this.locale = locale;
		}

		@NotEmpty(message = "Company can't be empty")
		public String getCompany() {
			return company;
		}

		public void setCompany(String company) {
			this.company = company;
		}
}
