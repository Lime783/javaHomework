package org.example.template;

import java.math.BigDecimal;
import java.math.RoundingMode;

public enum Planet {
    EARTH(new BigDecimal("20.1"), new BigDecimal("21.1")),
    MERCURY(new BigDecimal("20.1"), new BigDecimal("21.112122")),
    VENUS(new BigDecimal("20.1"), new BigDecimal("21.1513365")),
    JUPITER(new BigDecimal("20.1"), new BigDecimal("214231.1")),
    SATURN(new BigDecimal("20.1"), new BigDecimal("26471.1")),
    URANUS(new BigDecimal("20.1"), new BigDecimal("21.000000000001")),
    NEPTUNE(new BigDecimal("20.1"), new BigDecimal("0.00001")),
    MARS(new BigDecimal("2"), new BigDecimal("10"));

    private final BigDecimal massInTons;
    private final BigDecimal radiusInKilometers;

    Planet(BigDecimal massInTons, BigDecimal radiusInKilometers) {
        this.massInTons = massInTons;
        this.radiusInKilometers = radiusInKilometers;
    }

    public BigDecimal getMassInTons() {
        return massInTons;
    }

    public BigDecimal getRadiusInKilometers() {
        return radiusInKilometers;
    }

    public BigDecimal getDensity() {
        return getMassInTons().divide(getRadiusInKilometers(), 5, RoundingMode.HALF_UP);
    }

    @Override
    public String toString() {
        return "Planet " + this.name() +
                ", weight: " + this.massInTons +
                "t, radius: " + this.radiusInKilometers +
                "km, density: " + this.getDensity() + " t/km";
    }
}
