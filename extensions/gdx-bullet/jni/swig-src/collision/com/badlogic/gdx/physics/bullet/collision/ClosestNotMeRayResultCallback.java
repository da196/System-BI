/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.collision;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.physics.bullet.linearmath.*;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class ClosestNotMeRayResultCallback extends ClosestRayResultCallback {
	private long swigCPtr;
	
	protected ClosestNotMeRayResultCallback(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, CollisionJNI.ClosestNotMeRayResultCallback_SWIGUpcast(cPtr), cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new ClosestNotMeRayResultCallback, normally you should not need this constructor it's intended for low-level usage. */
	public ClosestNotMeRayResultCallback(long cPtr, boolean cMemoryOwn) {
		this("ClosestNotMeRayResultCallback", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(CollisionJNI.ClosestNotMeRayResultCallback_SWIGUpcast(swigCPtr = cPtr), cMemoryOwn);
	}
	
	public static long getCPtr(ClosestNotMeRayResultCallback obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	@Override
	protected void finalize() throws Throwable {
		if (!destroyed)
			destroy();
		super.finalize();
	}

  @Override protected synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				CollisionJNI.delete_ClosestNotMeRayResultCallback(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public ClosestNotMeRayResultCallback(btCollisionObject me) {
    this(CollisionJNI.new_ClosestNotMeRayResultCallback(btCollisionObject.getCPtr(me), me), true);
  }

}