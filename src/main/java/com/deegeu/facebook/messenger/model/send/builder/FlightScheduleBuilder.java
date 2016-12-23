/*
 * The MIT License
 *
 * Copyright 2016 DJ Spiess and DeegeU.com.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.deegeu.facebook.messenger.model.send.builder;

import com.deegeu.facebook.messenger.model.send.FlightSchedule;
import java.time.LocalDateTime;
import static java.time.format.DateTimeFormatter.ISO_LOCAL_DATE_TIME;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 *
 * @author dspiess
 */
final public class FlightScheduleBuilder {

    private LocalDateTime boardingTime;

    private LocalDateTime departureTime;

    private LocalDateTime arrivalTime;
    
    public FlightScheduleBuilder() { }

    public FlightScheduleBuilder boardingTime(LocalDateTime boardingTime) {
        this.boardingTime = boardingTime;
        return this;
    }

    public FlightScheduleBuilder departureTime(LocalDateTime departureTime) {
        this.departureTime = departureTime;
        return this;
    }

    public FlightScheduleBuilder arrivalTime(LocalDateTime arrivalTime) {
        this.arrivalTime = arrivalTime;
        return this;
    }
    
    public FlightSchedule build() {
        validateFlightSchedule();
        
        FlightSchedule schedule = new FlightSchedule();
        
        schedule.setArrivalTime(ISO_LOCAL_DATE_TIME.format(this.arrivalTime));
        schedule.setDepartureTime(ISO_LOCAL_DATE_TIME.format(this.departureTime));
        
        if (this.boardingTime != null) {
            schedule.setBoardingTime(ISO_LOCAL_DATE_TIME.format(this.boardingTime));
        }
        
        return schedule;
    }

    private void validateFlightSchedule() throws IllegalArgumentException {
        if (this.arrivalTime == null) {
            throw new IllegalArgumentException(
                    "FlightScheduleBuilder 'arrivalTime' cannot be null.");
        }
        if (this.departureTime == null) {
            throw new IllegalArgumentException(
                    "FlightScheduleBuilder 'departureTime' cannot be null.");
        }
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }    
}
