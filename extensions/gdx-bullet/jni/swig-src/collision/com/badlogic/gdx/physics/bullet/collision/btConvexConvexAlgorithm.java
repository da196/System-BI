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

public class btConvexConvexAlgorithm extends btActivatingCollisionAlgorithm {
	private long swigCPtr;
	
	protected btConvexConvexAlgorithm(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, CollisionJNI.btConvexConvexAlgorithm_SWIGUpcast(cPtr), cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btConvexConvexAlgorithm, normally you should not need this constructor it's intended for low-level usage. */
	public btConvexConvexAlgorithm(long cPtr, boolean cMemoryOwn) {
		this("btConvexConvexAlgorithm", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(CollisionJNI.btConvexConvexAlgorithm_SWIGUpcast(swigCPtr = cPtr), cMemoryOwn);
	}
	
	public static long getCPtr(btConvexConvexAlgorithm obj) {
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
				CollisionJNI.delete_btConvexConvexAlgorithm(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public btConvexConvexAlgorithm(btPersistentManifold mf, btCollisionAlgorithmConstructionInfo ci, btCollisionObjectWrapper body0Wrap, btCollisionObjectWrapper body1Wrap, btConvexPenetrationDepthSolver pdSolver, int numPerturbationIterations, int minimumPointsPerturbationThreshold) {
    this(CollisionJNI.new_btConvexConvexAlgorithm(btPersistentManifold.getCPtr(mf), mf, btCollisionAlgorithmConstructionInfo.getCPtr(ci), ci, btCollisionObjectWrapper.getCPtr(body0Wrap), body0Wrap, btCollisionObjectWrapper.getCPtr(body1Wrap), body1Wrap, btConvexPenetrationDepthSolver.getCPtr(pdSolver), pdSolver, numPerturbationIterations, minimumPointsPerturbationThreshold), true);
  }

  public void setLowLevelOfDetail(boolean useLowLevel) {
    CollisionJNI.btConvexConvexAlgorithm_setLowLevelOfDetail(swigCPtr, this, useLowLevel);
  }

  public btPersistentManifold getManifold() {
    long cPtr = CollisionJNI.btConvexConvexAlgorithm_getManifold(swigCPtr, this);
    return (cPtr == 0) ? null : new btPersistentManifold(cPtr, false);
  }

  static public class CreateFunc extends btCollisionAlgorithmCreateFunc {
  	private long swigCPtr;
  	
  	protected CreateFunc(final String className, long cPtr, boolean cMemoryOwn) {
  		super(className, CollisionJNI.btConvexConvexAlgorithm_CreateFunc_SWIGUpcast(cPtr), cMemoryOwn);
  		swigCPtr = cPtr;
  	}
  	
  	/** Construct a new CreateFunc, normally you should not need this constructor it's intended for low-level usage. */
  	public CreateFunc(long cPtr, boolean cMemoryOwn) {
  		this("CreateFunc", cPtr, cMemoryOwn);
  		construct();
  	}
  	
  	@Override
  	protected void reset(long cPtr, boolean cMemoryOwn) {
  		if (!destroyed)
  			destroy();
  		super.reset(CollisionJNI.btConvexConvexAlgorithm_CreateFunc_SWIGUpcast(swigCPtr = cPtr), cMemoryOwn);
  	}
  	
  	public static long getCPtr(CreateFunc obj) {
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
  				CollisionJNI.delete_btConvexConvexAlgorithm_CreateFunc(swigCPtr);
  			}
  			swigCPtr = 0;
  		}
  		super.delete();
  	}
  
    public void setPdSolver(btConvexPenetrationDepthSolver value) {
      CollisionJNI.btConvexConvexAlgorithm_CreateFunc_pdSolver_set(swigCPtr, this, btConvexPenetrationDepthSolver.getCPtr(value), value);
    }
  
    public btConvexPenetrationDepthSolver getPdSolver() {
      long cPtr = CollisionJNI.btConvexConvexAlgorithm_CreateFunc_pdSolver_get(swigCPtr, this);
      return (cPtr == 0) ? null : new btConvexPenetrationDepthSolver(cPtr, false);
    }
  
    public void setNumPerturbationIterations(int value) {
      CollisionJNI.btConvexConvexAlgorithm_CreateFunc_numPerturbationIterations_set(swigCPtr, this, value);
    }
  
    public int getNumPerturbationIterations() {
      return CollisionJNI.btConvexConvexAlgorithm_CreateFunc_numPerturbationIterations_get(swigCPtr, this);
    }
  
    public void setMinimumPointsPerturbationThreshold(int value) {
      CollisionJNI.btConvexConvexAlgorithm_CreateFunc_minimumPointsPerturbationThreshold_set(swigCPtr, this, value);
    }
  
    public int getMinimumPointsPerturbationThreshold() {
      return CollisionJNI.btConvexConvexAlgorithm_CreateFunc_minimumPointsPerturbationThreshold_get(swigCPtr, this);
    }
  
    public CreateFunc(btConvexPenetrationDepthSolver pdSolver) {
      this(CollisionJNI.new_btConvexConvexAlgorithm_CreateFunc(btConvexPenetrationDepthSolver.getCPtr(pdSolver), pdSolver), true);
    }
  
  }

}
