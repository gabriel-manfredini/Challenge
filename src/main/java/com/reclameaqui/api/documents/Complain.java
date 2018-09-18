package com.reclameaqui.api.documents;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Complain {

		@Id
		private String Id;
		private String Title;
		private String Description;
		private String Locale;
		private String Company;
		
		public Complain() {
			
		}

		public String getId() {
			return Id;
		}

		public void setId(String id) {
			Id = id;
		}

		public String getTitle() {
			return Title;
		}

		public void setTitle(String title) {
			Title = title;
		}

		public String getDescription() {
			return Description;
		}

		public void setDescription(String description) {
			Description = description;
		}

		public String getLocale() {
			return Locale;
		}

		public void setLocale(String locale) {
			Locale = locale;
		}

		public String getCompany() {
			return Company;
		}

		public void setCompany(String company) {
			Company = company;
		}
}
