import java.util.*;
	public class BuilderPattern {
		2
		    static class Coffee {
		3
		        private Coffee(Builder builder) {
		4
		            this.type = builder.type;
		5
		            this.sugar = builder.sugar;
		6
		            this.milk = builder.milk;
		7
		            this.size = builder.size;
		8
		        }
		9
		10
		        private String type;
		11
		        private boolean sugar;
		12
		        private boolean milk;
		13
		        private String size;
		14
		15
		        public static class Builder {
		16
		            private String type;
		17
		            private boolean sugar;
		18
		            private boolean milk;
		19
		            private String size;
		20
		21
		            public Builder(String type) {
		22
		                this.type = type;
		23
		            }
		24
		25
		            public Builder sugar(boolean value) {
		26
		                this.sugar = value;
		27
		                return this;
		28
		            }
		29
		30
		            public Builder milk(boolean value) {
		31
		                this.milk = value;
		32
		                return this;
		33
		            }
		34
		35
		            public Builder size(String value) {
		36
		                this.size = value;
		37
		                return this;
		38
		            }
		39
		40
		            public Coffee build() {
		41
		                return new Coffee(this);
		42
		            }
		43
		        }
		44
		45
		        @Override
		46
		        public String toString() {
		47
		            return String.format("Coffee [type=%s, sugar=%s, milk=%s, size=%s]", this.type, sugar, milk, size);
		48
		        }
		49
		50
		    }
		51
		52
		    public static void main(String[] args) {
		53
		        Coffee coffee = new BuilderPattern.Coffee.Builder("Mocha").milk(true).sugar(false).size("Large").build();
		54
		        System.out.println(coffee);
		55
		56
		    }
		57
		}

}
