package kr.co.yeonflix.schedule;

import java.sql.Date;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class ScheduleDTO {

	private int scheduleIdx, movieIdx, theaterIdx, scheduleStatus, remainSeats;
	private Date screenDate;
	private Timestamp startTime, endTime;

}