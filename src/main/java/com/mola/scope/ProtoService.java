package com.mola.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * 多实例bean
 */
@Service
@Scope("prototype")
public class ProtoService {
}
