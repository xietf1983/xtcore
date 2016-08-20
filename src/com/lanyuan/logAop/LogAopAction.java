package com.lanyuan.logAop;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import org.apache.shiro.SecurityUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.lanyuan.annotation.SystemLog;
import com.lanyuan.entity.LogFormMap;
import com.lanyuan.mapper.LogMapper;
import com.lanyuan.util.Common;

/**
 * 日志类
 * @author dell
 * 
 */
@Aspect
@Component
public class LogAopAction {

}
