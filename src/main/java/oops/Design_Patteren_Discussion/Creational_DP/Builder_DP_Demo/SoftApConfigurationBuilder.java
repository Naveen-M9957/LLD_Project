public class SoftApConfigurationBuilder {
    
    public static final int BAND_2GHZ = 1;
    public static final int BAND_5GHZ = 2;
    public static final int BAND_6GHZ = 4;

    private String ssid;
    private String password;
    private int securityType;
    private int channel;
    private int band;

    private SoftApConfigurationBuilder(Builder builder) {
        // Private constructor to prevent direct instantiation
        this.ssid = builder.ssid;
        this.password = builder.password;
        this.securityType = builder.securityType;
        this.channel = builder.channel;
        this.band = builder.band;
    }

    public String getSsid() {
        return ssid;
    }
    public String getPassword() {
        return password;
    }
    public int getSecurityType() {
        return securityType;
    }
    public int getChannel() {
        return channel;
    }
    public int getBand() {
        return band;
    }
    
    @Override
    public String toString() {
        return "SoftApConfigurationBuilder{" +
                "ssid='" + ssid + '\'' +
                ", password='" + password + '\'' +
                ", securityType=" + securityType +
                ", channel=" + channel +
                ", band=" + band +
                '}';
    }

    public static class Builder {
        private String ssid;
        private String password;
        private int securityType;
        private int channel;
        private int band;

        public Builder setSsid(String ssid) {
            this.ssid = ssid;
            return this;
        }

        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }

        public Builder setSecurityType(int securityType) {
            this.securityType = securityType;
            return this;
        }

        public Builder setChannel(int channel) {
            this.channel = channel;
            return this;
        }

        public Builder setBand(int band) {
            this.band = band;
            return this;
        }

        public SoftApConfigurationBuilder build() {
            // Validate the parameters before creating the SoftApConfigurationBuilder instance
            if (ssid == null || ssid.isEmpty()) {
                throw new IllegalArgumentException("SSID cannot be null or empty");
            }
            if (password == null || password.isEmpty()) {
                throw new IllegalArgumentException("Password cannot be null or empty");
            }
            if (securityType < 0) {
                throw new IllegalArgumentException("Security type cannot be negative");
            }
            if (channel < 0) {
                throw new IllegalArgumentException("Channel cannot be negative");
            }
            if (band != BAND_2GHZ && band != BAND_5GHZ && band != BAND_6GHZ) {
                throw new IllegalArgumentException("Invalid band value");
            }
            
            return new SoftApConfigurationBuilder(this);
        }
    }
}
