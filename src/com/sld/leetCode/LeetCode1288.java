package com.sld.leetCode;

import java.util.Arrays;

/**
 * @Author: shaold
 * @since 2021-2-10 11:25
 */
public class LeetCode1288 {
    public int removeCoveredIntervals(int[][] intervals) {
        // 排序
        Arrays.sort(intervals, (a, b) ->{
            if (a[0] == b[0]){
                return b[1] - a[1];
            }
            return a[0] - b[0];
        });
        int left = intervals[0][0];
        int right = intervals[0][1];
        int res = 0;
        for (int i = 1; i < intervals.length; i++) {
            int[] intv = intervals[i];
            // 三种情况 覆盖
            if (intv[0] >= left && intv[1] <= right){
                res++;
            }
            // 相交
            if (right <= intv[1] && right >= intv[0]){
                right = intv[1];
            }
            if (right < intv[0]){
                left = intv[0];
                right = intv[1];
            }
        }
        return intervals.length - res;
    }

    int removeCoveredIntervals2(int[][] intervals) {
        // 按照起点升序排列，起点相同时降序排列
        Arrays.sort(intervals, (a, b) -> {
            if (a[0] == b[0]) {
                return b[1] - a[1];
            }
            return a[0] - b[0];
        });

        // 记录合并区间的起点和终点
        int left = intervals[0][0];
        int right = intervals[0][1];

        int res = 0;
        for (int i = 1; i < intervals.length; i++) {
            int[] intv = intervals[i];
            // 情况一，找到覆盖区间
            if (left <= intv[0] && right >= intv[1]) {
                res++;
            }
            // 情况二，找到相交区间，合并
            if (right >= intv[0] && right <= intv[1]) {
                right = intv[1];
            }
            // 情况三，完全不相交，更新起点和终点
            if (right < intv[0]) {
                left = intv[0];
                right = intv[1];
            }
        }

        return intervals.length - res;
    }
}
