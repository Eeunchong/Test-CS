package com.example.career.domain.calendar.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PossibleTimeSortByDate {
    List<PossibleTime> possibleTimeList;
    LocalDate date;
}
