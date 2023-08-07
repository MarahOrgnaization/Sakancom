	package classes;

		public class IdAndTennant {

			private int housingId;
			private String tenants;
			

			public IdAndTennant() {}
			public IdAndTennant(int housingId,String tenants) {
				this.housingId = housingId;
				this.tenants = tenants;
				
				
			}
			

			public void setTenants(String  tenants) {
				this.tenants = tenants;
			}
			public String getTenants() {
				return tenants;
			}
			
			public void sethousingId(int housingId) {
				this.housingId = housingId;
			}
			
			public int gethousingId() {
				return housingId;
			}
		}