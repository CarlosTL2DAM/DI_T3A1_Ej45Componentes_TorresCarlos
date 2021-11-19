/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miscontroles;

import java.beans.*;

/**
 *
 * @author usuario
 */
public class MiControlBeanInfo extends SimpleBeanInfo {

    // Bean descriptor//GEN-FIRST:BeanDescriptor
    /*lazy BeanDescriptor*/
    private static BeanDescriptor getBdescriptor(){
        BeanDescriptor beanDescriptor = new BeanDescriptor  ( miscontroles.MiControl.class , null ); // NOI18N//GEN-HEADEREND:BeanDescriptor
        // Here you can add code for customizing the BeanDescriptor.

        return beanDescriptor;     }//GEN-LAST:BeanDescriptor


    // Property identifiers//GEN-FIRST:Properties
    private static final int PROPERTY_accessibleHelp = 0;
    private static final int PROPERTY_accessibleRole = 1;
    private static final int PROPERTY_accessibleRoleDescription = 2;
    private static final int PROPERTY_accessibleText = 3;
    private static final int PROPERTY_background = 4;
    private static final int PROPERTY_baselineOffset = 5;
    private static final int PROPERTY_blendMode = 6;
    private static final int PROPERTY_border = 7;
    private static final int PROPERTY_boundsInLocal = 8;
    private static final int PROPERTY_boundsInParent = 9;
    private static final int PROPERTY_cache = 10;
    private static final int PROPERTY_cacheHint = 11;
    private static final int PROPERTY_cacheShape = 12;
    private static final int PROPERTY_centerShape = 13;
    private static final int PROPERTY_childrenUnmodifiable = 14;
    private static final int PROPERTY_clip = 15;
    private static final int PROPERTY_contentBias = 16;
    private static final int PROPERTY_cssMetaData = 17;
    private static final int PROPERTY_cursor = 18;
    private static final int PROPERTY_depthTest = 19;
    private static final int PROPERTY_disable = 20;
    private static final int PROPERTY_disabled = 21;
    private static final int PROPERTY_effect = 22;
    private static final int PROPERTY_effectiveNodeOrientation = 23;
    private static final int PROPERTY_eventDispatcher = 24;
    private static final int PROPERTY_focused = 25;
    private static final int PROPERTY_focusTraversable = 26;
    private static final int PROPERTY_height = 27;
    private static final int PROPERTY_hover = 28;
    private static final int PROPERTY_id = 29;
    private static final int PROPERTY_impl_traversalEngine = 30;
    private static final int PROPERTY_inputMethodRequests = 31;
    private static final int PROPERTY_insets = 32;
    private static final int PROPERTY_layoutBounds = 33;
    private static final int PROPERTY_layoutX = 34;
    private static final int PROPERTY_layoutY = 35;
    private static final int PROPERTY_localToParentTransform = 36;
    private static final int PROPERTY_localToSceneTransform = 37;
    private static final int PROPERTY_managed = 38;
    private static final int PROPERTY_maxHeight = 39;
    private static final int PROPERTY_maxWidth = 40;
    private static final int PROPERTY_minHeight = 41;
    private static final int PROPERTY_minWidth = 42;
    private static final int PROPERTY_mouseTransparent = 43;
    private static final int PROPERTY_needsLayout = 44;
    private static final int PROPERTY_nodeOrientation = 45;
    private static final int PROPERTY_onAction = 46;
    private static final int PROPERTY_onContextMenuRequested = 47;
    private static final int PROPERTY_onDragDetected = 48;
    private static final int PROPERTY_onDragDone = 49;
    private static final int PROPERTY_onDragDropped = 50;
    private static final int PROPERTY_onDragEntered = 51;
    private static final int PROPERTY_onDragExited = 52;
    private static final int PROPERTY_onDragOver = 53;
    private static final int PROPERTY_onInputMethodTextChanged = 54;
    private static final int PROPERTY_onKeyPressed = 55;
    private static final int PROPERTY_onKeyReleased = 56;
    private static final int PROPERTY_onKeyTyped = 57;
    private static final int PROPERTY_onMouseClicked = 58;
    private static final int PROPERTY_onMouseDragEntered = 59;
    private static final int PROPERTY_onMouseDragExited = 60;
    private static final int PROPERTY_onMouseDragged = 61;
    private static final int PROPERTY_onMouseDragOver = 62;
    private static final int PROPERTY_onMouseDragReleased = 63;
    private static final int PROPERTY_onMouseEntered = 64;
    private static final int PROPERTY_onMouseExited = 65;
    private static final int PROPERTY_onMouseMoved = 66;
    private static final int PROPERTY_onMousePressed = 67;
    private static final int PROPERTY_onMouseReleased = 68;
    private static final int PROPERTY_onRotate = 69;
    private static final int PROPERTY_onRotationFinished = 70;
    private static final int PROPERTY_onRotationStarted = 71;
    private static final int PROPERTY_onScroll = 72;
    private static final int PROPERTY_onScrollFinished = 73;
    private static final int PROPERTY_onScrollStarted = 74;
    private static final int PROPERTY_onSwipeDown = 75;
    private static final int PROPERTY_onSwipeLeft = 76;
    private static final int PROPERTY_onSwipeRight = 77;
    private static final int PROPERTY_onSwipeUp = 78;
    private static final int PROPERTY_onTouchMoved = 79;
    private static final int PROPERTY_onTouchPressed = 80;
    private static final int PROPERTY_onTouchReleased = 81;
    private static final int PROPERTY_onTouchStationary = 82;
    private static final int PROPERTY_onZoom = 83;
    private static final int PROPERTY_onZoomFinished = 84;
    private static final int PROPERTY_onZoomStarted = 85;
    private static final int PROPERTY_opacity = 86;
    private static final int PROPERTY_opaqueInsets = 87;
    private static final int PROPERTY_padding = 88;
    private static final int PROPERTY_parent = 89;
    private static final int PROPERTY_pickOnBounds = 90;
    private static final int PROPERTY_prefHeight = 91;
    private static final int PROPERTY_prefWidth = 92;
    private static final int PROPERTY_pressed = 93;
    private static final int PROPERTY_properties = 94;
    private static final int PROPERTY_pseudoClassStates = 95;
    private static final int PROPERTY_resizable = 96;
    private static final int PROPERTY_rotate = 97;
    private static final int PROPERTY_rotationAxis = 98;
    private static final int PROPERTY_scaleShape = 99;
    private static final int PROPERTY_scaleX = 100;
    private static final int PROPERTY_scaleY = 101;
    private static final int PROPERTY_scaleZ = 102;
    private static final int PROPERTY_scene = 103;
    private static final int PROPERTY_shape = 104;
    private static final int PROPERTY_snapToPixel = 105;
    private static final int PROPERTY_style = 106;
    private static final int PROPERTY_styleableParent = 107;
    private static final int PROPERTY_styleClass = 108;
    private static final int PROPERTY_stylesheets = 109;
    private static final int PROPERTY_transforms = 110;
    private static final int PROPERTY_translateX = 111;
    private static final int PROPERTY_translateY = 112;
    private static final int PROPERTY_translateZ = 113;
    private static final int PROPERTY_typeSelector = 114;
    private static final int PROPERTY_userAgentStylesheet = 115;
    private static final int PROPERTY_userData = 116;
    private static final int PROPERTY_visible = 117;
    private static final int PROPERTY_width = 118;

    // Property array 
    /*lazy PropertyDescriptor*/
    private static PropertyDescriptor[] getPdescriptor(){
        PropertyDescriptor[] properties = new PropertyDescriptor[119];
    
        try {
            properties[PROPERTY_accessibleHelp] = new PropertyDescriptor ( "accessibleHelp", miscontroles.MiControl.class, "getAccessibleHelp", "setAccessibleHelp" ); // NOI18N
            properties[PROPERTY_accessibleRole] = new PropertyDescriptor ( "accessibleRole", miscontroles.MiControl.class, "getAccessibleRole", "setAccessibleRole" ); // NOI18N
            properties[PROPERTY_accessibleRoleDescription] = new PropertyDescriptor ( "accessibleRoleDescription", miscontroles.MiControl.class, "getAccessibleRoleDescription", "setAccessibleRoleDescription" ); // NOI18N
            properties[PROPERTY_accessibleText] = new PropertyDescriptor ( "accessibleText", miscontroles.MiControl.class, "getAccessibleText", "setAccessibleText" ); // NOI18N
            properties[PROPERTY_background] = new PropertyDescriptor ( "background", miscontroles.MiControl.class, "getBackground", "setBackground" ); // NOI18N
            properties[PROPERTY_baselineOffset] = new PropertyDescriptor ( "baselineOffset", miscontroles.MiControl.class, "getBaselineOffset", null ); // NOI18N
            properties[PROPERTY_blendMode] = new PropertyDescriptor ( "blendMode", miscontroles.MiControl.class, "getBlendMode", "setBlendMode" ); // NOI18N
            properties[PROPERTY_border] = new PropertyDescriptor ( "border", miscontroles.MiControl.class, "getBorder", "setBorder" ); // NOI18N
            properties[PROPERTY_boundsInLocal] = new PropertyDescriptor ( "boundsInLocal", miscontroles.MiControl.class, "getBoundsInLocal", null ); // NOI18N
            properties[PROPERTY_boundsInParent] = new PropertyDescriptor ( "boundsInParent", miscontroles.MiControl.class, "getBoundsInParent", null ); // NOI18N
            properties[PROPERTY_cache] = new PropertyDescriptor ( "cache", miscontroles.MiControl.class, "isCache", "setCache" ); // NOI18N
            properties[PROPERTY_cacheHint] = new PropertyDescriptor ( "cacheHint", miscontroles.MiControl.class, "getCacheHint", "setCacheHint" ); // NOI18N
            properties[PROPERTY_cacheShape] = new PropertyDescriptor ( "cacheShape", miscontroles.MiControl.class, "isCacheShape", "setCacheShape" ); // NOI18N
            properties[PROPERTY_centerShape] = new PropertyDescriptor ( "centerShape", miscontroles.MiControl.class, "isCenterShape", "setCenterShape" ); // NOI18N
            properties[PROPERTY_childrenUnmodifiable] = new PropertyDescriptor ( "childrenUnmodifiable", miscontroles.MiControl.class, "getChildrenUnmodifiable", null ); // NOI18N
            properties[PROPERTY_clip] = new PropertyDescriptor ( "clip", miscontroles.MiControl.class, "getClip", "setClip" ); // NOI18N
            properties[PROPERTY_contentBias] = new PropertyDescriptor ( "contentBias", miscontroles.MiControl.class, "getContentBias", null ); // NOI18N
            properties[PROPERTY_cssMetaData] = new PropertyDescriptor ( "cssMetaData", miscontroles.MiControl.class, "getCssMetaData", null ); // NOI18N
            properties[PROPERTY_cursor] = new PropertyDescriptor ( "cursor", miscontroles.MiControl.class, "getCursor", "setCursor" ); // NOI18N
            properties[PROPERTY_depthTest] = new PropertyDescriptor ( "depthTest", miscontroles.MiControl.class, "getDepthTest", "setDepthTest" ); // NOI18N
            properties[PROPERTY_disable] = new PropertyDescriptor ( "disable", miscontroles.MiControl.class, "isDisable", "setDisable" ); // NOI18N
            properties[PROPERTY_disabled] = new PropertyDescriptor ( "disabled", miscontroles.MiControl.class, "isDisabled", null ); // NOI18N
            properties[PROPERTY_effect] = new PropertyDescriptor ( "effect", miscontroles.MiControl.class, "getEffect", "setEffect" ); // NOI18N
            properties[PROPERTY_effectiveNodeOrientation] = new PropertyDescriptor ( "effectiveNodeOrientation", miscontroles.MiControl.class, "getEffectiveNodeOrientation", null ); // NOI18N
            properties[PROPERTY_eventDispatcher] = new PropertyDescriptor ( "eventDispatcher", miscontroles.MiControl.class, "getEventDispatcher", "setEventDispatcher" ); // NOI18N
            properties[PROPERTY_focused] = new PropertyDescriptor ( "focused", miscontroles.MiControl.class, "isFocused", null ); // NOI18N
            properties[PROPERTY_focusTraversable] = new PropertyDescriptor ( "focusTraversable", miscontroles.MiControl.class, "isFocusTraversable", "setFocusTraversable" ); // NOI18N
            properties[PROPERTY_height] = new PropertyDescriptor ( "height", miscontroles.MiControl.class, "getHeight", null ); // NOI18N
            properties[PROPERTY_hover] = new PropertyDescriptor ( "hover", miscontroles.MiControl.class, "isHover", null ); // NOI18N
            properties[PROPERTY_id] = new PropertyDescriptor ( "id", miscontroles.MiControl.class, "getId", "setId" ); // NOI18N
            properties[PROPERTY_impl_traversalEngine] = new PropertyDescriptor ( "impl_traversalEngine", miscontroles.MiControl.class, "getImpl_traversalEngine", "setImpl_traversalEngine" ); // NOI18N
            properties[PROPERTY_inputMethodRequests] = new PropertyDescriptor ( "inputMethodRequests", miscontroles.MiControl.class, "getInputMethodRequests", "setInputMethodRequests" ); // NOI18N
            properties[PROPERTY_insets] = new PropertyDescriptor ( "insets", miscontroles.MiControl.class, "getInsets", null ); // NOI18N
            properties[PROPERTY_layoutBounds] = new PropertyDescriptor ( "layoutBounds", miscontroles.MiControl.class, "getLayoutBounds", null ); // NOI18N
            properties[PROPERTY_layoutX] = new PropertyDescriptor ( "layoutX", miscontroles.MiControl.class, "getLayoutX", "setLayoutX" ); // NOI18N
            properties[PROPERTY_layoutY] = new PropertyDescriptor ( "layoutY", miscontroles.MiControl.class, "getLayoutY", "setLayoutY" ); // NOI18N
            properties[PROPERTY_localToParentTransform] = new PropertyDescriptor ( "localToParentTransform", miscontroles.MiControl.class, "getLocalToParentTransform", null ); // NOI18N
            properties[PROPERTY_localToSceneTransform] = new PropertyDescriptor ( "localToSceneTransform", miscontroles.MiControl.class, "getLocalToSceneTransform", null ); // NOI18N
            properties[PROPERTY_managed] = new PropertyDescriptor ( "managed", miscontroles.MiControl.class, "isManaged", "setManaged" ); // NOI18N
            properties[PROPERTY_maxHeight] = new PropertyDescriptor ( "maxHeight", miscontroles.MiControl.class, "getMaxHeight", "setMaxHeight" ); // NOI18N
            properties[PROPERTY_maxWidth] = new PropertyDescriptor ( "maxWidth", miscontroles.MiControl.class, "getMaxWidth", "setMaxWidth" ); // NOI18N
            properties[PROPERTY_minHeight] = new PropertyDescriptor ( "minHeight", miscontroles.MiControl.class, "getMinHeight", "setMinHeight" ); // NOI18N
            properties[PROPERTY_minWidth] = new PropertyDescriptor ( "minWidth", miscontroles.MiControl.class, "getMinWidth", "setMinWidth" ); // NOI18N
            properties[PROPERTY_mouseTransparent] = new PropertyDescriptor ( "mouseTransparent", miscontroles.MiControl.class, "isMouseTransparent", "setMouseTransparent" ); // NOI18N
            properties[PROPERTY_needsLayout] = new PropertyDescriptor ( "needsLayout", miscontroles.MiControl.class, "isNeedsLayout", null ); // NOI18N
            properties[PROPERTY_nodeOrientation] = new PropertyDescriptor ( "nodeOrientation", miscontroles.MiControl.class, "getNodeOrientation", "setNodeOrientation" ); // NOI18N
            properties[PROPERTY_onAction] = new PropertyDescriptor ( "onAction", miscontroles.MiControl.class, "getOnAction", "setOnAction" ); // NOI18N
            properties[PROPERTY_onContextMenuRequested] = new PropertyDescriptor ( "onContextMenuRequested", miscontroles.MiControl.class, "getOnContextMenuRequested", "setOnContextMenuRequested" ); // NOI18N
            properties[PROPERTY_onDragDetected] = new PropertyDescriptor ( "onDragDetected", miscontroles.MiControl.class, "getOnDragDetected", "setOnDragDetected" ); // NOI18N
            properties[PROPERTY_onDragDone] = new PropertyDescriptor ( "onDragDone", miscontroles.MiControl.class, "getOnDragDone", "setOnDragDone" ); // NOI18N
            properties[PROPERTY_onDragDropped] = new PropertyDescriptor ( "onDragDropped", miscontroles.MiControl.class, "getOnDragDropped", "setOnDragDropped" ); // NOI18N
            properties[PROPERTY_onDragEntered] = new PropertyDescriptor ( "onDragEntered", miscontroles.MiControl.class, "getOnDragEntered", "setOnDragEntered" ); // NOI18N
            properties[PROPERTY_onDragExited] = new PropertyDescriptor ( "onDragExited", miscontroles.MiControl.class, "getOnDragExited", "setOnDragExited" ); // NOI18N
            properties[PROPERTY_onDragOver] = new PropertyDescriptor ( "onDragOver", miscontroles.MiControl.class, "getOnDragOver", "setOnDragOver" ); // NOI18N
            properties[PROPERTY_onInputMethodTextChanged] = new PropertyDescriptor ( "onInputMethodTextChanged", miscontroles.MiControl.class, "getOnInputMethodTextChanged", "setOnInputMethodTextChanged" ); // NOI18N
            properties[PROPERTY_onKeyPressed] = new PropertyDescriptor ( "onKeyPressed", miscontroles.MiControl.class, "getOnKeyPressed", "setOnKeyPressed" ); // NOI18N
            properties[PROPERTY_onKeyReleased] = new PropertyDescriptor ( "onKeyReleased", miscontroles.MiControl.class, "getOnKeyReleased", "setOnKeyReleased" ); // NOI18N
            properties[PROPERTY_onKeyTyped] = new PropertyDescriptor ( "onKeyTyped", miscontroles.MiControl.class, "getOnKeyTyped", "setOnKeyTyped" ); // NOI18N
            properties[PROPERTY_onMouseClicked] = new PropertyDescriptor ( "onMouseClicked", miscontroles.MiControl.class, "getOnMouseClicked", "setOnMouseClicked" ); // NOI18N
            properties[PROPERTY_onMouseDragEntered] = new PropertyDescriptor ( "onMouseDragEntered", miscontroles.MiControl.class, "getOnMouseDragEntered", "setOnMouseDragEntered" ); // NOI18N
            properties[PROPERTY_onMouseDragExited] = new PropertyDescriptor ( "onMouseDragExited", miscontroles.MiControl.class, "getOnMouseDragExited", "setOnMouseDragExited" ); // NOI18N
            properties[PROPERTY_onMouseDragged] = new PropertyDescriptor ( "onMouseDragged", miscontroles.MiControl.class, "getOnMouseDragged", "setOnMouseDragged" ); // NOI18N
            properties[PROPERTY_onMouseDragOver] = new PropertyDescriptor ( "onMouseDragOver", miscontroles.MiControl.class, "getOnMouseDragOver", "setOnMouseDragOver" ); // NOI18N
            properties[PROPERTY_onMouseDragReleased] = new PropertyDescriptor ( "onMouseDragReleased", miscontroles.MiControl.class, "getOnMouseDragReleased", "setOnMouseDragReleased" ); // NOI18N
            properties[PROPERTY_onMouseEntered] = new PropertyDescriptor ( "onMouseEntered", miscontroles.MiControl.class, "getOnMouseEntered", "setOnMouseEntered" ); // NOI18N
            properties[PROPERTY_onMouseExited] = new PropertyDescriptor ( "onMouseExited", miscontroles.MiControl.class, "getOnMouseExited", "setOnMouseExited" ); // NOI18N
            properties[PROPERTY_onMouseMoved] = new PropertyDescriptor ( "onMouseMoved", miscontroles.MiControl.class, "getOnMouseMoved", "setOnMouseMoved" ); // NOI18N
            properties[PROPERTY_onMousePressed] = new PropertyDescriptor ( "onMousePressed", miscontroles.MiControl.class, "getOnMousePressed", "setOnMousePressed" ); // NOI18N
            properties[PROPERTY_onMouseReleased] = new PropertyDescriptor ( "onMouseReleased", miscontroles.MiControl.class, "getOnMouseReleased", "setOnMouseReleased" ); // NOI18N
            properties[PROPERTY_onRotate] = new PropertyDescriptor ( "onRotate", miscontroles.MiControl.class, "getOnRotate", "setOnRotate" ); // NOI18N
            properties[PROPERTY_onRotationFinished] = new PropertyDescriptor ( "onRotationFinished", miscontroles.MiControl.class, "getOnRotationFinished", "setOnRotationFinished" ); // NOI18N
            properties[PROPERTY_onRotationStarted] = new PropertyDescriptor ( "onRotationStarted", miscontroles.MiControl.class, "getOnRotationStarted", "setOnRotationStarted" ); // NOI18N
            properties[PROPERTY_onScroll] = new PropertyDescriptor ( "onScroll", miscontroles.MiControl.class, "getOnScroll", "setOnScroll" ); // NOI18N
            properties[PROPERTY_onScrollFinished] = new PropertyDescriptor ( "onScrollFinished", miscontroles.MiControl.class, "getOnScrollFinished", "setOnScrollFinished" ); // NOI18N
            properties[PROPERTY_onScrollStarted] = new PropertyDescriptor ( "onScrollStarted", miscontroles.MiControl.class, "getOnScrollStarted", "setOnScrollStarted" ); // NOI18N
            properties[PROPERTY_onSwipeDown] = new PropertyDescriptor ( "onSwipeDown", miscontroles.MiControl.class, "getOnSwipeDown", "setOnSwipeDown" ); // NOI18N
            properties[PROPERTY_onSwipeLeft] = new PropertyDescriptor ( "onSwipeLeft", miscontroles.MiControl.class, "getOnSwipeLeft", "setOnSwipeLeft" ); // NOI18N
            properties[PROPERTY_onSwipeRight] = new PropertyDescriptor ( "onSwipeRight", miscontroles.MiControl.class, "getOnSwipeRight", "setOnSwipeRight" ); // NOI18N
            properties[PROPERTY_onSwipeUp] = new PropertyDescriptor ( "onSwipeUp", miscontroles.MiControl.class, "getOnSwipeUp", "setOnSwipeUp" ); // NOI18N
            properties[PROPERTY_onTouchMoved] = new PropertyDescriptor ( "onTouchMoved", miscontroles.MiControl.class, "getOnTouchMoved", "setOnTouchMoved" ); // NOI18N
            properties[PROPERTY_onTouchPressed] = new PropertyDescriptor ( "onTouchPressed", miscontroles.MiControl.class, "getOnTouchPressed", "setOnTouchPressed" ); // NOI18N
            properties[PROPERTY_onTouchReleased] = new PropertyDescriptor ( "onTouchReleased", miscontroles.MiControl.class, "getOnTouchReleased", "setOnTouchReleased" ); // NOI18N
            properties[PROPERTY_onTouchStationary] = new PropertyDescriptor ( "onTouchStationary", miscontroles.MiControl.class, "getOnTouchStationary", "setOnTouchStationary" ); // NOI18N
            properties[PROPERTY_onZoom] = new PropertyDescriptor ( "onZoom", miscontroles.MiControl.class, "getOnZoom", "setOnZoom" ); // NOI18N
            properties[PROPERTY_onZoomFinished] = new PropertyDescriptor ( "onZoomFinished", miscontroles.MiControl.class, "getOnZoomFinished", "setOnZoomFinished" ); // NOI18N
            properties[PROPERTY_onZoomStarted] = new PropertyDescriptor ( "onZoomStarted", miscontroles.MiControl.class, "getOnZoomStarted", "setOnZoomStarted" ); // NOI18N
            properties[PROPERTY_opacity] = new PropertyDescriptor ( "opacity", miscontroles.MiControl.class, "getOpacity", "setOpacity" ); // NOI18N
            properties[PROPERTY_opaqueInsets] = new PropertyDescriptor ( "opaqueInsets", miscontroles.MiControl.class, "getOpaqueInsets", "setOpaqueInsets" ); // NOI18N
            properties[PROPERTY_padding] = new PropertyDescriptor ( "padding", miscontroles.MiControl.class, "getPadding", "setPadding" ); // NOI18N
            properties[PROPERTY_parent] = new PropertyDescriptor ( "parent", miscontroles.MiControl.class, "getParent", null ); // NOI18N
            properties[PROPERTY_pickOnBounds] = new PropertyDescriptor ( "pickOnBounds", miscontroles.MiControl.class, "isPickOnBounds", "setPickOnBounds" ); // NOI18N
            properties[PROPERTY_prefHeight] = new PropertyDescriptor ( "prefHeight", miscontroles.MiControl.class, "getPrefHeight", "setPrefHeight" ); // NOI18N
            properties[PROPERTY_prefWidth] = new PropertyDescriptor ( "prefWidth", miscontroles.MiControl.class, "getPrefWidth", "setPrefWidth" ); // NOI18N
            properties[PROPERTY_pressed] = new PropertyDescriptor ( "pressed", miscontroles.MiControl.class, "isPressed", null ); // NOI18N
            properties[PROPERTY_properties] = new PropertyDescriptor ( "properties", miscontroles.MiControl.class, "getProperties", null ); // NOI18N
            properties[PROPERTY_pseudoClassStates] = new PropertyDescriptor ( "pseudoClassStates", miscontroles.MiControl.class, "getPseudoClassStates", null ); // NOI18N
            properties[PROPERTY_resizable] = new PropertyDescriptor ( "resizable", miscontroles.MiControl.class, "isResizable", null ); // NOI18N
            properties[PROPERTY_rotate] = new PropertyDescriptor ( "rotate", miscontroles.MiControl.class, "getRotate", "setRotate" ); // NOI18N
            properties[PROPERTY_rotationAxis] = new PropertyDescriptor ( "rotationAxis", miscontroles.MiControl.class, "getRotationAxis", "setRotationAxis" ); // NOI18N
            properties[PROPERTY_scaleShape] = new PropertyDescriptor ( "scaleShape", miscontroles.MiControl.class, "isScaleShape", "setScaleShape" ); // NOI18N
            properties[PROPERTY_scaleX] = new PropertyDescriptor ( "scaleX", miscontroles.MiControl.class, "getScaleX", "setScaleX" ); // NOI18N
            properties[PROPERTY_scaleY] = new PropertyDescriptor ( "scaleY", miscontroles.MiControl.class, "getScaleY", "setScaleY" ); // NOI18N
            properties[PROPERTY_scaleZ] = new PropertyDescriptor ( "scaleZ", miscontroles.MiControl.class, "getScaleZ", "setScaleZ" ); // NOI18N
            properties[PROPERTY_scene] = new PropertyDescriptor ( "scene", miscontroles.MiControl.class, "getScene", null ); // NOI18N
            properties[PROPERTY_shape] = new PropertyDescriptor ( "shape", miscontroles.MiControl.class, "getShape", "setShape" ); // NOI18N
            properties[PROPERTY_snapToPixel] = new PropertyDescriptor ( "snapToPixel", miscontroles.MiControl.class, "isSnapToPixel", "setSnapToPixel" ); // NOI18N
            properties[PROPERTY_style] = new PropertyDescriptor ( "style", miscontroles.MiControl.class, "getStyle", "setStyle" ); // NOI18N
            properties[PROPERTY_styleableParent] = new PropertyDescriptor ( "styleableParent", miscontroles.MiControl.class, "getStyleableParent", null ); // NOI18N
            properties[PROPERTY_styleClass] = new PropertyDescriptor ( "styleClass", miscontroles.MiControl.class, "getStyleClass", null ); // NOI18N
            properties[PROPERTY_stylesheets] = new PropertyDescriptor ( "stylesheets", miscontroles.MiControl.class, "getStylesheets", null ); // NOI18N
            properties[PROPERTY_transforms] = new PropertyDescriptor ( "transforms", miscontroles.MiControl.class, "getTransforms", null ); // NOI18N
            properties[PROPERTY_translateX] = new PropertyDescriptor ( "translateX", miscontroles.MiControl.class, "getTranslateX", "setTranslateX" ); // NOI18N
            properties[PROPERTY_translateY] = new PropertyDescriptor ( "translateY", miscontroles.MiControl.class, "getTranslateY", "setTranslateY" ); // NOI18N
            properties[PROPERTY_translateZ] = new PropertyDescriptor ( "translateZ", miscontroles.MiControl.class, "getTranslateZ", "setTranslateZ" ); // NOI18N
            properties[PROPERTY_typeSelector] = new PropertyDescriptor ( "typeSelector", miscontroles.MiControl.class, "getTypeSelector", null ); // NOI18N
            properties[PROPERTY_userAgentStylesheet] = new PropertyDescriptor ( "userAgentStylesheet", miscontroles.MiControl.class, "getUserAgentStylesheet", null ); // NOI18N
            properties[PROPERTY_userData] = new PropertyDescriptor ( "userData", miscontroles.MiControl.class, "getUserData", "setUserData" ); // NOI18N
            properties[PROPERTY_visible] = new PropertyDescriptor ( "visible", miscontroles.MiControl.class, "isVisible", "setVisible" ); // NOI18N
            properties[PROPERTY_width] = new PropertyDescriptor ( "width", miscontroles.MiControl.class, "getWidth", null ); // NOI18N
        }
        catch(IntrospectionException e) {
            e.printStackTrace();
        }//GEN-HEADEREND:Properties
        // Here you can add code for customizing the properties array.

        return properties;     }//GEN-LAST:Properties

    // EventSet identifiers//GEN-FIRST:Events

    // EventSet array
    /*lazy EventSetDescriptor*/
    private static EventSetDescriptor[] getEdescriptor(){
        EventSetDescriptor[] eventSets = new EventSetDescriptor[0];//GEN-HEADEREND:Events
        // Here you can add code for customizing the event sets array.

        return eventSets;     }//GEN-LAST:Events

    // Method identifiers//GEN-FIRST:Methods
    private static final int METHOD_accessibleHelpProperty0 = 0;
    private static final int METHOD_accessibleRoleDescriptionProperty1 = 1;
    private static final int METHOD_accessibleRoleProperty2 = 2;
    private static final int METHOD_accessibleTextProperty3 = 3;
    private static final int METHOD_addEventFilter4 = 4;
    private static final int METHOD_addEventHandler5 = 5;
    private static final int METHOD_applyCss6 = 6;
    private static final int METHOD_autosize7 = 7;
    private static final int METHOD_backgroundProperty8 = 8;
    private static final int METHOD_blendModeProperty9 = 9;
    private static final int METHOD_borderProperty10 = 10;
    private static final int METHOD_boundsInLocalProperty11 = 11;
    private static final int METHOD_boundsInParentProperty12 = 12;
    private static final int METHOD_buildEventDispatchChain13 = 13;
    private static final int METHOD_cacheHintProperty14 = 14;
    private static final int METHOD_cacheProperty15 = 15;
    private static final int METHOD_cacheShapeProperty16 = 16;
    private static final int METHOD_centerShapeProperty17 = 17;
    private static final int METHOD_clipProperty18 = 18;
    private static final int METHOD_computeAreaInScreen19 = 19;
    private static final int METHOD_contains20 = 20;
    private static final int METHOD_contains21 = 21;
    private static final int METHOD_cursorProperty22 = 22;
    private static final int METHOD_depthTestProperty23 = 23;
    private static final int METHOD_disabledProperty24 = 24;
    private static final int METHOD_disableProperty25 = 25;
    private static final int METHOD_effectiveNodeOrientationProperty26 = 26;
    private static final int METHOD_effectProperty27 = 27;
    private static final int METHOD_eventDispatcherProperty28 = 28;
    private static final int METHOD_executeAccessibleAction29 = 29;
    private static final int METHOD_fireEvent30 = 30;
    private static final int METHOD_focusedProperty31 = 31;
    private static final int METHOD_focusTraversableProperty32 = 32;
    private static final int METHOD_getClassCssMetaData33 = 33;
    private static final int METHOD_getClassCssMetaData34 = 34;
    private static final int METHOD_hasProperties35 = 35;
    private static final int METHOD_heightProperty36 = 36;
    private static final int METHOD_hoverProperty37 = 37;
    private static final int METHOD_idProperty38 = 38;
    private static final int METHOD_impl_computeGeomBounds39 = 39;
    private static final int METHOD_impl_createPeer40 = 40;
    private static final int METHOD_impl_findStyles41 = 41;
    private static final int METHOD_impl_getAllParentStylesheets42 = 42;
    private static final int METHOD_impl_getLeafTransform43 = 43;
    private static final int METHOD_impl_getMatchingStyles44 = 44;
    private static final int METHOD_impl_getPeer45 = 45;
    private static final int METHOD_impl_getPivotX46 = 46;
    private static final int METHOD_impl_getPivotY47 = 47;
    private static final int METHOD_impl_getPivotZ48 = 48;
    private static final int METHOD_impl_getStyleMap49 = 49;
    private static final int METHOD_impl_hasTransforms50 = 50;
    private static final int METHOD_impl_isShowMnemonics51 = 51;
    private static final int METHOD_impl_isTreeVisible52 = 52;
    private static final int METHOD_impl_pickNode53 = 53;
    private static final int METHOD_impl_processCSS54 = 54;
    private static final int METHOD_impl_processMXNode55 = 55;
    private static final int METHOD_impl_reapplyCSS56 = 56;
    private static final int METHOD_impl_setShowMnemonics57 = 57;
    private static final int METHOD_impl_setStyleMap58 = 58;
    private static final int METHOD_impl_showMnemonicsProperty59 = 59;
    private static final int METHOD_impl_syncPeer60 = 60;
    private static final int METHOD_impl_transformsChanged61 = 61;
    private static final int METHOD_impl_traversalEngineProperty62 = 62;
    private static final int METHOD_impl_traverse63 = 63;
    private static final int METHOD_impl_updatePeer64 = 64;
    private static final int METHOD_inputMethodRequestsProperty65 = 65;
    private static final int METHOD_insetsProperty66 = 66;
    private static final int METHOD_intersects67 = 67;
    private static final int METHOD_intersects68 = 68;
    private static final int METHOD_layout69 = 69;
    private static final int METHOD_layoutBoundsProperty70 = 70;
    private static final int METHOD_layoutInArea71 = 71;
    private static final int METHOD_layoutXProperty72 = 72;
    private static final int METHOD_layoutYProperty73 = 73;
    private static final int METHOD_localToParent74 = 74;
    private static final int METHOD_localToParent75 = 75;
    private static final int METHOD_localToParent76 = 76;
    private static final int METHOD_localToParent77 = 77;
    private static final int METHOD_localToParent78 = 78;
    private static final int METHOD_localToParentTransformProperty79 = 79;
    private static final int METHOD_localToScene80 = 80;
    private static final int METHOD_localToScene81 = 81;
    private static final int METHOD_localToScene82 = 82;
    private static final int METHOD_localToScene83 = 83;
    private static final int METHOD_localToScene84 = 84;
    private static final int METHOD_localToScene85 = 85;
    private static final int METHOD_localToScene86 = 86;
    private static final int METHOD_localToScene87 = 87;
    private static final int METHOD_localToScene88 = 88;
    private static final int METHOD_localToScene89 = 89;
    private static final int METHOD_localToSceneTransformProperty90 = 90;
    private static final int METHOD_localToScreen91 = 91;
    private static final int METHOD_localToScreen92 = 92;
    private static final int METHOD_localToScreen93 = 93;
    private static final int METHOD_localToScreen94 = 94;
    private static final int METHOD_localToScreen95 = 95;
    private static final int METHOD_lookup96 = 96;
    private static final int METHOD_lookupAll97 = 97;
    private static final int METHOD_managedProperty98 = 98;
    private static final int METHOD_maxHeight99 = 99;
    private static final int METHOD_maxHeightProperty100 = 100;
    private static final int METHOD_maxWidth101 = 101;
    private static final int METHOD_maxWidthProperty102 = 102;
    private static final int METHOD_minHeight103 = 103;
    private static final int METHOD_minHeightProperty104 = 104;
    private static final int METHOD_minWidth105 = 105;
    private static final int METHOD_minWidthProperty106 = 106;
    private static final int METHOD_mouseTransparentProperty107 = 107;
    private static final int METHOD_needsLayoutProperty108 = 108;
    private static final int METHOD_nodeOrientationProperty109 = 109;
    private static final int METHOD_notifyAccessibleAttributeChanged110 = 110;
    private static final int METHOD_onActionProperty111 = 111;
    private static final int METHOD_onContextMenuRequestedProperty112 = 112;
    private static final int METHOD_onDragDetectedProperty113 = 113;
    private static final int METHOD_onDragDoneProperty114 = 114;
    private static final int METHOD_onDragDroppedProperty115 = 115;
    private static final int METHOD_onDragEnteredProperty116 = 116;
    private static final int METHOD_onDragExitedProperty117 = 117;
    private static final int METHOD_onDragOverProperty118 = 118;
    private static final int METHOD_onInputMethodTextChangedProperty119 = 119;
    private static final int METHOD_onKeyPressedProperty120 = 120;
    private static final int METHOD_onKeyReleasedProperty121 = 121;
    private static final int METHOD_onKeyTypedProperty122 = 122;
    private static final int METHOD_onMouseClickedProperty123 = 123;
    private static final int METHOD_onMouseDragEnteredProperty124 = 124;
    private static final int METHOD_onMouseDragExitedProperty125 = 125;
    private static final int METHOD_onMouseDraggedProperty126 = 126;
    private static final int METHOD_onMouseDragOverProperty127 = 127;
    private static final int METHOD_onMouseDragReleasedProperty128 = 128;
    private static final int METHOD_onMouseEnteredProperty129 = 129;
    private static final int METHOD_onMouseExitedProperty130 = 130;
    private static final int METHOD_onMouseMovedProperty131 = 131;
    private static final int METHOD_onMousePressedProperty132 = 132;
    private static final int METHOD_onMouseReleasedProperty133 = 133;
    private static final int METHOD_onRotateProperty134 = 134;
    private static final int METHOD_onRotationFinishedProperty135 = 135;
    private static final int METHOD_onRotationStartedProperty136 = 136;
    private static final int METHOD_onScrollFinishedProperty137 = 137;
    private static final int METHOD_onScrollProperty138 = 138;
    private static final int METHOD_onScrollStartedProperty139 = 139;
    private static final int METHOD_onSwipeDownProperty140 = 140;
    private static final int METHOD_onSwipeLeftProperty141 = 141;
    private static final int METHOD_onSwipeRightProperty142 = 142;
    private static final int METHOD_onSwipeUpProperty143 = 143;
    private static final int METHOD_onTouchMovedProperty144 = 144;
    private static final int METHOD_onTouchPressedProperty145 = 145;
    private static final int METHOD_onTouchReleasedProperty146 = 146;
    private static final int METHOD_onTouchStationaryProperty147 = 147;
    private static final int METHOD_onZoomFinishedProperty148 = 148;
    private static final int METHOD_onZoomProperty149 = 149;
    private static final int METHOD_onZoomStartedProperty150 = 150;
    private static final int METHOD_opacityProperty151 = 151;
    private static final int METHOD_opaqueInsetsProperty152 = 152;
    private static final int METHOD_paddingProperty153 = 153;
    private static final int METHOD_parentProperty154 = 154;
    private static final int METHOD_parentToLocal155 = 155;
    private static final int METHOD_parentToLocal156 = 156;
    private static final int METHOD_parentToLocal157 = 157;
    private static final int METHOD_parentToLocal158 = 158;
    private static final int METHOD_parentToLocal159 = 159;
    private static final int METHOD_pickOnBoundsProperty160 = 160;
    private static final int METHOD_positionInArea161 = 161;
    private static final int METHOD_prefHeight162 = 162;
    private static final int METHOD_prefHeightProperty163 = 163;
    private static final int METHOD_prefWidth164 = 164;
    private static final int METHOD_prefWidthProperty165 = 165;
    private static final int METHOD_pressedProperty166 = 166;
    private static final int METHOD_pseudoClassStateChanged167 = 167;
    private static final int METHOD_queryAccessibleAttribute168 = 168;
    private static final int METHOD_relocate169 = 169;
    private static final int METHOD_removeEventFilter170 = 170;
    private static final int METHOD_removeEventHandler171 = 171;
    private static final int METHOD_requestFocus172 = 172;
    private static final int METHOD_requestLayout173 = 173;
    private static final int METHOD_resize174 = 174;
    private static final int METHOD_resizeRelocate175 = 175;
    private static final int METHOD_rotateProperty176 = 176;
    private static final int METHOD_rotationAxisProperty177 = 177;
    private static final int METHOD_scaleShapeProperty178 = 178;
    private static final int METHOD_scaleXProperty179 = 179;
    private static final int METHOD_scaleYProperty180 = 180;
    private static final int METHOD_scaleZProperty181 = 181;
    private static final int METHOD_sceneProperty182 = 182;
    private static final int METHOD_sceneToLocal183 = 183;
    private static final int METHOD_sceneToLocal184 = 184;
    private static final int METHOD_sceneToLocal185 = 185;
    private static final int METHOD_sceneToLocal186 = 186;
    private static final int METHOD_sceneToLocal187 = 187;
    private static final int METHOD_sceneToLocal188 = 188;
    private static final int METHOD_sceneToLocal189 = 189;
    private static final int METHOD_sceneToLocal190 = 190;
    private static final int METHOD_screenToLocal191 = 191;
    private static final int METHOD_screenToLocal192 = 192;
    private static final int METHOD_screenToLocal193 = 193;
    private static final int METHOD_setMaxSize194 = 194;
    private static final int METHOD_setMinSize195 = 195;
    private static final int METHOD_setPrefSize196 = 196;
    private static final int METHOD_shapeProperty197 = 197;
    private static final int METHOD_snappedBottomInset198 = 198;
    private static final int METHOD_snappedLeftInset199 = 199;
    private static final int METHOD_snappedRightInset200 = 200;
    private static final int METHOD_snappedTopInset201 = 201;
    private static final int METHOD_snapshot202 = 202;
    private static final int METHOD_snapshot203 = 203;
    private static final int METHOD_snapToPixelProperty204 = 204;
    private static final int METHOD_startDragAndDrop205 = 205;
    private static final int METHOD_startFullDrag206 = 206;
    private static final int METHOD_styleProperty207 = 207;
    private static final int METHOD_toBack208 = 208;
    private static final int METHOD_toFront209 = 209;
    private static final int METHOD_toString210 = 210;
    private static final int METHOD_translateXProperty211 = 211;
    private static final int METHOD_translateYProperty212 = 212;
    private static final int METHOD_translateZProperty213 = 213;
    private static final int METHOD_usesMirroring214 = 214;
    private static final int METHOD_visibleProperty215 = 215;
    private static final int METHOD_widthProperty216 = 216;

    // Method array 
    /*lazy MethodDescriptor*/
    private static MethodDescriptor[] getMdescriptor(){
        MethodDescriptor[] methods = new MethodDescriptor[217];
    
        try {
            methods[METHOD_accessibleHelpProperty0] = new MethodDescriptor(javafx.scene.Node.class.getMethod("accessibleHelpProperty", new Class[] {})); // NOI18N
            methods[METHOD_accessibleHelpProperty0].setDisplayName ( "" );
            methods[METHOD_accessibleRoleDescriptionProperty1] = new MethodDescriptor(javafx.scene.Node.class.getMethod("accessibleRoleDescriptionProperty", new Class[] {})); // NOI18N
            methods[METHOD_accessibleRoleDescriptionProperty1].setDisplayName ( "" );
            methods[METHOD_accessibleRoleProperty2] = new MethodDescriptor(javafx.scene.Node.class.getMethod("accessibleRoleProperty", new Class[] {})); // NOI18N
            methods[METHOD_accessibleRoleProperty2].setDisplayName ( "" );
            methods[METHOD_accessibleTextProperty3] = new MethodDescriptor(javafx.scene.Node.class.getMethod("accessibleTextProperty", new Class[] {})); // NOI18N
            methods[METHOD_accessibleTextProperty3].setDisplayName ( "" );
            methods[METHOD_addEventFilter4] = new MethodDescriptor(javafx.scene.Node.class.getMethod("addEventFilter", new Class[] {javafx.event.EventType.class, javafx.event.EventHandler.class})); // NOI18N
            methods[METHOD_addEventFilter4].setDisplayName ( "" );
            methods[METHOD_addEventHandler5] = new MethodDescriptor(javafx.scene.Node.class.getMethod("addEventHandler", new Class[] {javafx.event.EventType.class, javafx.event.EventHandler.class})); // NOI18N
            methods[METHOD_addEventHandler5].setDisplayName ( "" );
            methods[METHOD_applyCss6] = new MethodDescriptor(javafx.scene.Node.class.getMethod("applyCss", new Class[] {})); // NOI18N
            methods[METHOD_applyCss6].setDisplayName ( "" );
            methods[METHOD_autosize7] = new MethodDescriptor(javafx.scene.Node.class.getMethod("autosize", new Class[] {})); // NOI18N
            methods[METHOD_autosize7].setDisplayName ( "" );
            methods[METHOD_backgroundProperty8] = new MethodDescriptor(javafx.scene.layout.Region.class.getMethod("backgroundProperty", new Class[] {})); // NOI18N
            methods[METHOD_backgroundProperty8].setDisplayName ( "" );
            methods[METHOD_blendModeProperty9] = new MethodDescriptor(javafx.scene.Node.class.getMethod("blendModeProperty", new Class[] {})); // NOI18N
            methods[METHOD_blendModeProperty9].setDisplayName ( "" );
            methods[METHOD_borderProperty10] = new MethodDescriptor(javafx.scene.layout.Region.class.getMethod("borderProperty", new Class[] {})); // NOI18N
            methods[METHOD_borderProperty10].setDisplayName ( "" );
            methods[METHOD_boundsInLocalProperty11] = new MethodDescriptor(javafx.scene.Node.class.getMethod("boundsInLocalProperty", new Class[] {})); // NOI18N
            methods[METHOD_boundsInLocalProperty11].setDisplayName ( "" );
            methods[METHOD_boundsInParentProperty12] = new MethodDescriptor(javafx.scene.Node.class.getMethod("boundsInParentProperty", new Class[] {})); // NOI18N
            methods[METHOD_boundsInParentProperty12].setDisplayName ( "" );
            methods[METHOD_buildEventDispatchChain13] = new MethodDescriptor(javafx.scene.Node.class.getMethod("buildEventDispatchChain", new Class[] {javafx.event.EventDispatchChain.class})); // NOI18N
            methods[METHOD_buildEventDispatchChain13].setDisplayName ( "" );
            methods[METHOD_cacheHintProperty14] = new MethodDescriptor(javafx.scene.Node.class.getMethod("cacheHintProperty", new Class[] {})); // NOI18N
            methods[METHOD_cacheHintProperty14].setDisplayName ( "" );
            methods[METHOD_cacheProperty15] = new MethodDescriptor(javafx.scene.Node.class.getMethod("cacheProperty", new Class[] {})); // NOI18N
            methods[METHOD_cacheProperty15].setDisplayName ( "" );
            methods[METHOD_cacheShapeProperty16] = new MethodDescriptor(javafx.scene.layout.Region.class.getMethod("cacheShapeProperty", new Class[] {})); // NOI18N
            methods[METHOD_cacheShapeProperty16].setDisplayName ( "" );
            methods[METHOD_centerShapeProperty17] = new MethodDescriptor(javafx.scene.layout.Region.class.getMethod("centerShapeProperty", new Class[] {})); // NOI18N
            methods[METHOD_centerShapeProperty17].setDisplayName ( "" );
            methods[METHOD_clipProperty18] = new MethodDescriptor(javafx.scene.Node.class.getMethod("clipProperty", new Class[] {})); // NOI18N
            methods[METHOD_clipProperty18].setDisplayName ( "" );
            methods[METHOD_computeAreaInScreen19] = new MethodDescriptor(javafx.scene.Node.class.getMethod("computeAreaInScreen", new Class[] {})); // NOI18N
            methods[METHOD_computeAreaInScreen19].setDisplayName ( "" );
            methods[METHOD_contains20] = new MethodDescriptor(javafx.scene.Node.class.getMethod("contains", new Class[] {double.class, double.class})); // NOI18N
            methods[METHOD_contains20].setDisplayName ( "" );
            methods[METHOD_contains21] = new MethodDescriptor(javafx.scene.Node.class.getMethod("contains", new Class[] {javafx.geometry.Point2D.class})); // NOI18N
            methods[METHOD_contains21].setDisplayName ( "" );
            methods[METHOD_cursorProperty22] = new MethodDescriptor(javafx.scene.Node.class.getMethod("cursorProperty", new Class[] {})); // NOI18N
            methods[METHOD_cursorProperty22].setDisplayName ( "" );
            methods[METHOD_depthTestProperty23] = new MethodDescriptor(javafx.scene.Node.class.getMethod("depthTestProperty", new Class[] {})); // NOI18N
            methods[METHOD_depthTestProperty23].setDisplayName ( "" );
            methods[METHOD_disabledProperty24] = new MethodDescriptor(javafx.scene.Node.class.getMethod("disabledProperty", new Class[] {})); // NOI18N
            methods[METHOD_disabledProperty24].setDisplayName ( "" );
            methods[METHOD_disableProperty25] = new MethodDescriptor(javafx.scene.Node.class.getMethod("disableProperty", new Class[] {})); // NOI18N
            methods[METHOD_disableProperty25].setDisplayName ( "" );
            methods[METHOD_effectiveNodeOrientationProperty26] = new MethodDescriptor(javafx.scene.Node.class.getMethod("effectiveNodeOrientationProperty", new Class[] {})); // NOI18N
            methods[METHOD_effectiveNodeOrientationProperty26].setDisplayName ( "" );
            methods[METHOD_effectProperty27] = new MethodDescriptor(javafx.scene.Node.class.getMethod("effectProperty", new Class[] {})); // NOI18N
            methods[METHOD_effectProperty27].setDisplayName ( "" );
            methods[METHOD_eventDispatcherProperty28] = new MethodDescriptor(javafx.scene.Node.class.getMethod("eventDispatcherProperty", new Class[] {})); // NOI18N
            methods[METHOD_eventDispatcherProperty28].setDisplayName ( "" );
            methods[METHOD_executeAccessibleAction29] = new MethodDescriptor(javafx.scene.Node.class.getMethod("executeAccessibleAction", new Class[] {javafx.scene.AccessibleAction.class, java.lang.Object[].class})); // NOI18N
            methods[METHOD_executeAccessibleAction29].setDisplayName ( "" );
            methods[METHOD_fireEvent30] = new MethodDescriptor(javafx.scene.Node.class.getMethod("fireEvent", new Class[] {javafx.event.Event.class})); // NOI18N
            methods[METHOD_fireEvent30].setDisplayName ( "" );
            methods[METHOD_focusedProperty31] = new MethodDescriptor(javafx.scene.Node.class.getMethod("focusedProperty", new Class[] {})); // NOI18N
            methods[METHOD_focusedProperty31].setDisplayName ( "" );
            methods[METHOD_focusTraversableProperty32] = new MethodDescriptor(javafx.scene.Node.class.getMethod("focusTraversableProperty", new Class[] {})); // NOI18N
            methods[METHOD_focusTraversableProperty32].setDisplayName ( "" );
            methods[METHOD_getClassCssMetaData33] = new MethodDescriptor(javafx.scene.Node.class.getMethod("getClassCssMetaData", new Class[] {})); // NOI18N
            methods[METHOD_getClassCssMetaData33].setDisplayName ( "" );
            methods[METHOD_getClassCssMetaData34] = new MethodDescriptor(javafx.scene.layout.Region.class.getMethod("getClassCssMetaData", new Class[] {})); // NOI18N
            methods[METHOD_getClassCssMetaData34].setDisplayName ( "" );
            methods[METHOD_hasProperties35] = new MethodDescriptor(javafx.scene.Node.class.getMethod("hasProperties", new Class[] {})); // NOI18N
            methods[METHOD_hasProperties35].setDisplayName ( "" );
            methods[METHOD_heightProperty36] = new MethodDescriptor(javafx.scene.layout.Region.class.getMethod("heightProperty", new Class[] {})); // NOI18N
            methods[METHOD_heightProperty36].setDisplayName ( "" );
            methods[METHOD_hoverProperty37] = new MethodDescriptor(javafx.scene.Node.class.getMethod("hoverProperty", new Class[] {})); // NOI18N
            methods[METHOD_hoverProperty37].setDisplayName ( "" );
            methods[METHOD_idProperty38] = new MethodDescriptor(javafx.scene.Node.class.getMethod("idProperty", new Class[] {})); // NOI18N
            methods[METHOD_idProperty38].setDisplayName ( "" );
            methods[METHOD_impl_computeGeomBounds39] = new MethodDescriptor(javafx.scene.layout.Region.class.getMethod("impl_computeGeomBounds", new Class[] {com.sun.javafx.geom.BaseBounds.class, com.sun.javafx.geom.transform.BaseTransform.class})); // NOI18N
            methods[METHOD_impl_computeGeomBounds39].setDisplayName ( "" );
            methods[METHOD_impl_createPeer40] = new MethodDescriptor(javafx.scene.layout.Region.class.getMethod("impl_createPeer", new Class[] {})); // NOI18N
            methods[METHOD_impl_createPeer40].setDisplayName ( "" );
            methods[METHOD_impl_findStyles41] = new MethodDescriptor(javafx.scene.Node.class.getMethod("impl_findStyles", new Class[] {java.util.Map.class})); // NOI18N
            methods[METHOD_impl_findStyles41].setDisplayName ( "" );
            methods[METHOD_impl_getAllParentStylesheets42] = new MethodDescriptor(javafx.scene.Parent.class.getMethod("impl_getAllParentStylesheets", new Class[] {})); // NOI18N
            methods[METHOD_impl_getAllParentStylesheets42].setDisplayName ( "" );
            methods[METHOD_impl_getLeafTransform43] = new MethodDescriptor(javafx.scene.Node.class.getMethod("impl_getLeafTransform", new Class[] {})); // NOI18N
            methods[METHOD_impl_getLeafTransform43].setDisplayName ( "" );
            methods[METHOD_impl_getMatchingStyles44] = new MethodDescriptor(javafx.scene.Node.class.getMethod("impl_getMatchingStyles", new Class[] {javafx.css.CssMetaData.class, javafx.css.Styleable.class})); // NOI18N
            methods[METHOD_impl_getMatchingStyles44].setDisplayName ( "" );
            methods[METHOD_impl_getPeer45] = new MethodDescriptor(javafx.scene.Node.class.getMethod("impl_getPeer", new Class[] {})); // NOI18N
            methods[METHOD_impl_getPeer45].setDisplayName ( "" );
            methods[METHOD_impl_getPivotX46] = new MethodDescriptor(javafx.scene.Node.class.getMethod("impl_getPivotX", new Class[] {})); // NOI18N
            methods[METHOD_impl_getPivotX46].setDisplayName ( "" );
            methods[METHOD_impl_getPivotY47] = new MethodDescriptor(javafx.scene.Node.class.getMethod("impl_getPivotY", new Class[] {})); // NOI18N
            methods[METHOD_impl_getPivotY47].setDisplayName ( "" );
            methods[METHOD_impl_getPivotZ48] = new MethodDescriptor(javafx.scene.Node.class.getMethod("impl_getPivotZ", new Class[] {})); // NOI18N
            methods[METHOD_impl_getPivotZ48].setDisplayName ( "" );
            methods[METHOD_impl_getStyleMap49] = new MethodDescriptor(javafx.scene.Node.class.getMethod("impl_getStyleMap", new Class[] {})); // NOI18N
            methods[METHOD_impl_getStyleMap49].setDisplayName ( "" );
            methods[METHOD_impl_hasTransforms50] = new MethodDescriptor(javafx.scene.Node.class.getMethod("impl_hasTransforms", new Class[] {})); // NOI18N
            methods[METHOD_impl_hasTransforms50].setDisplayName ( "" );
            methods[METHOD_impl_isShowMnemonics51] = new MethodDescriptor(javafx.scene.Node.class.getMethod("impl_isShowMnemonics", new Class[] {})); // NOI18N
            methods[METHOD_impl_isShowMnemonics51].setDisplayName ( "" );
            methods[METHOD_impl_isTreeVisible52] = new MethodDescriptor(javafx.scene.Node.class.getMethod("impl_isTreeVisible", new Class[] {})); // NOI18N
            methods[METHOD_impl_isTreeVisible52].setDisplayName ( "" );
            methods[METHOD_impl_pickNode53] = new MethodDescriptor(javafx.scene.Node.class.getMethod("impl_pickNode", new Class[] {com.sun.javafx.geom.PickRay.class, com.sun.javafx.scene.input.PickResultChooser.class})); // NOI18N
            methods[METHOD_impl_pickNode53].setDisplayName ( "" );
            methods[METHOD_impl_processCSS54] = new MethodDescriptor(javafx.scene.Node.class.getMethod("impl_processCSS", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_impl_processCSS54].setDisplayName ( "" );
            methods[METHOD_impl_processMXNode55] = new MethodDescriptor(javafx.scene.Parent.class.getMethod("impl_processMXNode", new Class[] {com.sun.javafx.jmx.MXNodeAlgorithm.class, com.sun.javafx.jmx.MXNodeAlgorithmContext.class})); // NOI18N
            methods[METHOD_impl_processMXNode55].setDisplayName ( "" );
            methods[METHOD_impl_reapplyCSS56] = new MethodDescriptor(javafx.scene.Node.class.getMethod("impl_reapplyCSS", new Class[] {})); // NOI18N
            methods[METHOD_impl_reapplyCSS56].setDisplayName ( "" );
            methods[METHOD_impl_setShowMnemonics57] = new MethodDescriptor(javafx.scene.Node.class.getMethod("impl_setShowMnemonics", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_impl_setShowMnemonics57].setDisplayName ( "" );
            methods[METHOD_impl_setStyleMap58] = new MethodDescriptor(javafx.scene.Node.class.getMethod("impl_setStyleMap", new Class[] {javafx.collections.ObservableMap.class})); // NOI18N
            methods[METHOD_impl_setStyleMap58].setDisplayName ( "" );
            methods[METHOD_impl_showMnemonicsProperty59] = new MethodDescriptor(javafx.scene.Node.class.getMethod("impl_showMnemonicsProperty", new Class[] {})); // NOI18N
            methods[METHOD_impl_showMnemonicsProperty59].setDisplayName ( "" );
            methods[METHOD_impl_syncPeer60] = new MethodDescriptor(javafx.scene.Node.class.getMethod("impl_syncPeer", new Class[] {})); // NOI18N
            methods[METHOD_impl_syncPeer60].setDisplayName ( "" );
            methods[METHOD_impl_transformsChanged61] = new MethodDescriptor(javafx.scene.Node.class.getMethod("impl_transformsChanged", new Class[] {})); // NOI18N
            methods[METHOD_impl_transformsChanged61].setDisplayName ( "" );
            methods[METHOD_impl_traversalEngineProperty62] = new MethodDescriptor(javafx.scene.Parent.class.getMethod("impl_traversalEngineProperty", new Class[] {})); // NOI18N
            methods[METHOD_impl_traversalEngineProperty62].setDisplayName ( "" );
            methods[METHOD_impl_traverse63] = new MethodDescriptor(javafx.scene.Node.class.getMethod("impl_traverse", new Class[] {com.sun.javafx.scene.traversal.Direction.class})); // NOI18N
            methods[METHOD_impl_traverse63].setDisplayName ( "" );
            methods[METHOD_impl_updatePeer64] = new MethodDescriptor(javafx.scene.layout.Region.class.getMethod("impl_updatePeer", new Class[] {})); // NOI18N
            methods[METHOD_impl_updatePeer64].setDisplayName ( "" );
            methods[METHOD_inputMethodRequestsProperty65] = new MethodDescriptor(javafx.scene.Node.class.getMethod("inputMethodRequestsProperty", new Class[] {})); // NOI18N
            methods[METHOD_inputMethodRequestsProperty65].setDisplayName ( "" );
            methods[METHOD_insetsProperty66] = new MethodDescriptor(javafx.scene.layout.Region.class.getMethod("insetsProperty", new Class[] {})); // NOI18N
            methods[METHOD_insetsProperty66].setDisplayName ( "" );
            methods[METHOD_intersects67] = new MethodDescriptor(javafx.scene.Node.class.getMethod("intersects", new Class[] {double.class, double.class, double.class, double.class})); // NOI18N
            methods[METHOD_intersects67].setDisplayName ( "" );
            methods[METHOD_intersects68] = new MethodDescriptor(javafx.scene.Node.class.getMethod("intersects", new Class[] {javafx.geometry.Bounds.class})); // NOI18N
            methods[METHOD_intersects68].setDisplayName ( "" );
            methods[METHOD_layout69] = new MethodDescriptor(javafx.scene.Parent.class.getMethod("layout", new Class[] {})); // NOI18N
            methods[METHOD_layout69].setDisplayName ( "" );
            methods[METHOD_layoutBoundsProperty70] = new MethodDescriptor(javafx.scene.Node.class.getMethod("layoutBoundsProperty", new Class[] {})); // NOI18N
            methods[METHOD_layoutBoundsProperty70].setDisplayName ( "" );
            methods[METHOD_layoutInArea71] = new MethodDescriptor(javafx.scene.layout.Region.class.getMethod("layoutInArea", new Class[] {javafx.scene.Node.class, double.class, double.class, double.class, double.class, double.class, javafx.geometry.Insets.class, boolean.class, boolean.class, javafx.geometry.HPos.class, javafx.geometry.VPos.class, boolean.class})); // NOI18N
            methods[METHOD_layoutInArea71].setDisplayName ( "" );
            methods[METHOD_layoutXProperty72] = new MethodDescriptor(javafx.scene.Node.class.getMethod("layoutXProperty", new Class[] {})); // NOI18N
            methods[METHOD_layoutXProperty72].setDisplayName ( "" );
            methods[METHOD_layoutYProperty73] = new MethodDescriptor(javafx.scene.Node.class.getMethod("layoutYProperty", new Class[] {})); // NOI18N
            methods[METHOD_layoutYProperty73].setDisplayName ( "" );
            methods[METHOD_localToParent74] = new MethodDescriptor(javafx.scene.Node.class.getMethod("localToParent", new Class[] {double.class, double.class})); // NOI18N
            methods[METHOD_localToParent74].setDisplayName ( "" );
            methods[METHOD_localToParent75] = new MethodDescriptor(javafx.scene.Node.class.getMethod("localToParent", new Class[] {javafx.geometry.Point2D.class})); // NOI18N
            methods[METHOD_localToParent75].setDisplayName ( "" );
            methods[METHOD_localToParent76] = new MethodDescriptor(javafx.scene.Node.class.getMethod("localToParent", new Class[] {javafx.geometry.Point3D.class})); // NOI18N
            methods[METHOD_localToParent76].setDisplayName ( "" );
            methods[METHOD_localToParent77] = new MethodDescriptor(javafx.scene.Node.class.getMethod("localToParent", new Class[] {double.class, double.class, double.class})); // NOI18N
            methods[METHOD_localToParent77].setDisplayName ( "" );
            methods[METHOD_localToParent78] = new MethodDescriptor(javafx.scene.Node.class.getMethod("localToParent", new Class[] {javafx.geometry.Bounds.class})); // NOI18N
            methods[METHOD_localToParent78].setDisplayName ( "" );
            methods[METHOD_localToParentTransformProperty79] = new MethodDescriptor(javafx.scene.Node.class.getMethod("localToParentTransformProperty", new Class[] {})); // NOI18N
            methods[METHOD_localToParentTransformProperty79].setDisplayName ( "" );
            methods[METHOD_localToScene80] = new MethodDescriptor(javafx.scene.Node.class.getMethod("localToScene", new Class[] {double.class, double.class})); // NOI18N
            methods[METHOD_localToScene80].setDisplayName ( "" );
            methods[METHOD_localToScene81] = new MethodDescriptor(javafx.scene.Node.class.getMethod("localToScene", new Class[] {javafx.geometry.Point2D.class})); // NOI18N
            methods[METHOD_localToScene81].setDisplayName ( "" );
            methods[METHOD_localToScene82] = new MethodDescriptor(javafx.scene.Node.class.getMethod("localToScene", new Class[] {javafx.geometry.Point3D.class})); // NOI18N
            methods[METHOD_localToScene82].setDisplayName ( "" );
            methods[METHOD_localToScene83] = new MethodDescriptor(javafx.scene.Node.class.getMethod("localToScene", new Class[] {double.class, double.class, double.class})); // NOI18N
            methods[METHOD_localToScene83].setDisplayName ( "" );
            methods[METHOD_localToScene84] = new MethodDescriptor(javafx.scene.Node.class.getMethod("localToScene", new Class[] {javafx.geometry.Point3D.class, boolean.class})); // NOI18N
            methods[METHOD_localToScene84].setDisplayName ( "" );
            methods[METHOD_localToScene85] = new MethodDescriptor(javafx.scene.Node.class.getMethod("localToScene", new Class[] {double.class, double.class, double.class, boolean.class})); // NOI18N
            methods[METHOD_localToScene85].setDisplayName ( "" );
            methods[METHOD_localToScene86] = new MethodDescriptor(javafx.scene.Node.class.getMethod("localToScene", new Class[] {javafx.geometry.Point2D.class, boolean.class})); // NOI18N
            methods[METHOD_localToScene86].setDisplayName ( "" );
            methods[METHOD_localToScene87] = new MethodDescriptor(javafx.scene.Node.class.getMethod("localToScene", new Class[] {double.class, double.class, boolean.class})); // NOI18N
            methods[METHOD_localToScene87].setDisplayName ( "" );
            methods[METHOD_localToScene88] = new MethodDescriptor(javafx.scene.Node.class.getMethod("localToScene", new Class[] {javafx.geometry.Bounds.class, boolean.class})); // NOI18N
            methods[METHOD_localToScene88].setDisplayName ( "" );
            methods[METHOD_localToScene89] = new MethodDescriptor(javafx.scene.Node.class.getMethod("localToScene", new Class[] {javafx.geometry.Bounds.class})); // NOI18N
            methods[METHOD_localToScene89].setDisplayName ( "" );
            methods[METHOD_localToSceneTransformProperty90] = new MethodDescriptor(javafx.scene.Node.class.getMethod("localToSceneTransformProperty", new Class[] {})); // NOI18N
            methods[METHOD_localToSceneTransformProperty90].setDisplayName ( "" );
            methods[METHOD_localToScreen91] = new MethodDescriptor(javafx.scene.Node.class.getMethod("localToScreen", new Class[] {double.class, double.class})); // NOI18N
            methods[METHOD_localToScreen91].setDisplayName ( "" );
            methods[METHOD_localToScreen92] = new MethodDescriptor(javafx.scene.Node.class.getMethod("localToScreen", new Class[] {javafx.geometry.Point2D.class})); // NOI18N
            methods[METHOD_localToScreen92].setDisplayName ( "" );
            methods[METHOD_localToScreen93] = new MethodDescriptor(javafx.scene.Node.class.getMethod("localToScreen", new Class[] {double.class, double.class, double.class})); // NOI18N
            methods[METHOD_localToScreen93].setDisplayName ( "" );
            methods[METHOD_localToScreen94] = new MethodDescriptor(javafx.scene.Node.class.getMethod("localToScreen", new Class[] {javafx.geometry.Point3D.class})); // NOI18N
            methods[METHOD_localToScreen94].setDisplayName ( "" );
            methods[METHOD_localToScreen95] = new MethodDescriptor(javafx.scene.Node.class.getMethod("localToScreen", new Class[] {javafx.geometry.Bounds.class})); // NOI18N
            methods[METHOD_localToScreen95].setDisplayName ( "" );
            methods[METHOD_lookup96] = new MethodDescriptor(javafx.scene.Parent.class.getMethod("lookup", new Class[] {java.lang.String.class})); // NOI18N
            methods[METHOD_lookup96].setDisplayName ( "" );
            methods[METHOD_lookupAll97] = new MethodDescriptor(javafx.scene.Node.class.getMethod("lookupAll", new Class[] {java.lang.String.class})); // NOI18N
            methods[METHOD_lookupAll97].setDisplayName ( "" );
            methods[METHOD_managedProperty98] = new MethodDescriptor(javafx.scene.Node.class.getMethod("managedProperty", new Class[] {})); // NOI18N
            methods[METHOD_managedProperty98].setDisplayName ( "" );
            methods[METHOD_maxHeight99] = new MethodDescriptor(javafx.scene.layout.Region.class.getMethod("maxHeight", new Class[] {double.class})); // NOI18N
            methods[METHOD_maxHeight99].setDisplayName ( "" );
            methods[METHOD_maxHeightProperty100] = new MethodDescriptor(javafx.scene.layout.Region.class.getMethod("maxHeightProperty", new Class[] {})); // NOI18N
            methods[METHOD_maxHeightProperty100].setDisplayName ( "" );
            methods[METHOD_maxWidth101] = new MethodDescriptor(javafx.scene.layout.Region.class.getMethod("maxWidth", new Class[] {double.class})); // NOI18N
            methods[METHOD_maxWidth101].setDisplayName ( "" );
            methods[METHOD_maxWidthProperty102] = new MethodDescriptor(javafx.scene.layout.Region.class.getMethod("maxWidthProperty", new Class[] {})); // NOI18N
            methods[METHOD_maxWidthProperty102].setDisplayName ( "" );
            methods[METHOD_minHeight103] = new MethodDescriptor(javafx.scene.layout.Region.class.getMethod("minHeight", new Class[] {double.class})); // NOI18N
            methods[METHOD_minHeight103].setDisplayName ( "" );
            methods[METHOD_minHeightProperty104] = new MethodDescriptor(javafx.scene.layout.Region.class.getMethod("minHeightProperty", new Class[] {})); // NOI18N
            methods[METHOD_minHeightProperty104].setDisplayName ( "" );
            methods[METHOD_minWidth105] = new MethodDescriptor(javafx.scene.layout.Region.class.getMethod("minWidth", new Class[] {double.class})); // NOI18N
            methods[METHOD_minWidth105].setDisplayName ( "" );
            methods[METHOD_minWidthProperty106] = new MethodDescriptor(javafx.scene.layout.Region.class.getMethod("minWidthProperty", new Class[] {})); // NOI18N
            methods[METHOD_minWidthProperty106].setDisplayName ( "" );
            methods[METHOD_mouseTransparentProperty107] = new MethodDescriptor(javafx.scene.Node.class.getMethod("mouseTransparentProperty", new Class[] {})); // NOI18N
            methods[METHOD_mouseTransparentProperty107].setDisplayName ( "" );
            methods[METHOD_needsLayoutProperty108] = new MethodDescriptor(javafx.scene.Parent.class.getMethod("needsLayoutProperty", new Class[] {})); // NOI18N
            methods[METHOD_needsLayoutProperty108].setDisplayName ( "" );
            methods[METHOD_nodeOrientationProperty109] = new MethodDescriptor(javafx.scene.Node.class.getMethod("nodeOrientationProperty", new Class[] {})); // NOI18N
            methods[METHOD_nodeOrientationProperty109].setDisplayName ( "" );
            methods[METHOD_notifyAccessibleAttributeChanged110] = new MethodDescriptor(javafx.scene.Node.class.getMethod("notifyAccessibleAttributeChanged", new Class[] {javafx.scene.AccessibleAttribute.class})); // NOI18N
            methods[METHOD_notifyAccessibleAttributeChanged110].setDisplayName ( "" );
            methods[METHOD_onActionProperty111] = new MethodDescriptor(miscontroles.MiControl.class.getMethod("onActionProperty", new Class[] {})); // NOI18N
            methods[METHOD_onActionProperty111].setDisplayName ( "" );
            methods[METHOD_onContextMenuRequestedProperty112] = new MethodDescriptor(javafx.scene.Node.class.getMethod("onContextMenuRequestedProperty", new Class[] {})); // NOI18N
            methods[METHOD_onContextMenuRequestedProperty112].setDisplayName ( "" );
            methods[METHOD_onDragDetectedProperty113] = new MethodDescriptor(javafx.scene.Node.class.getMethod("onDragDetectedProperty", new Class[] {})); // NOI18N
            methods[METHOD_onDragDetectedProperty113].setDisplayName ( "" );
            methods[METHOD_onDragDoneProperty114] = new MethodDescriptor(javafx.scene.Node.class.getMethod("onDragDoneProperty", new Class[] {})); // NOI18N
            methods[METHOD_onDragDoneProperty114].setDisplayName ( "" );
            methods[METHOD_onDragDroppedProperty115] = new MethodDescriptor(javafx.scene.Node.class.getMethod("onDragDroppedProperty", new Class[] {})); // NOI18N
            methods[METHOD_onDragDroppedProperty115].setDisplayName ( "" );
            methods[METHOD_onDragEnteredProperty116] = new MethodDescriptor(javafx.scene.Node.class.getMethod("onDragEnteredProperty", new Class[] {})); // NOI18N
            methods[METHOD_onDragEnteredProperty116].setDisplayName ( "" );
            methods[METHOD_onDragExitedProperty117] = new MethodDescriptor(javafx.scene.Node.class.getMethod("onDragExitedProperty", new Class[] {})); // NOI18N
            methods[METHOD_onDragExitedProperty117].setDisplayName ( "" );
            methods[METHOD_onDragOverProperty118] = new MethodDescriptor(javafx.scene.Node.class.getMethod("onDragOverProperty", new Class[] {})); // NOI18N
            methods[METHOD_onDragOverProperty118].setDisplayName ( "" );
            methods[METHOD_onInputMethodTextChangedProperty119] = new MethodDescriptor(javafx.scene.Node.class.getMethod("onInputMethodTextChangedProperty", new Class[] {})); // NOI18N
            methods[METHOD_onInputMethodTextChangedProperty119].setDisplayName ( "" );
            methods[METHOD_onKeyPressedProperty120] = new MethodDescriptor(javafx.scene.Node.class.getMethod("onKeyPressedProperty", new Class[] {})); // NOI18N
            methods[METHOD_onKeyPressedProperty120].setDisplayName ( "" );
            methods[METHOD_onKeyReleasedProperty121] = new MethodDescriptor(javafx.scene.Node.class.getMethod("onKeyReleasedProperty", new Class[] {})); // NOI18N
            methods[METHOD_onKeyReleasedProperty121].setDisplayName ( "" );
            methods[METHOD_onKeyTypedProperty122] = new MethodDescriptor(javafx.scene.Node.class.getMethod("onKeyTypedProperty", new Class[] {})); // NOI18N
            methods[METHOD_onKeyTypedProperty122].setDisplayName ( "" );
            methods[METHOD_onMouseClickedProperty123] = new MethodDescriptor(javafx.scene.Node.class.getMethod("onMouseClickedProperty", new Class[] {})); // NOI18N
            methods[METHOD_onMouseClickedProperty123].setDisplayName ( "" );
            methods[METHOD_onMouseDragEnteredProperty124] = new MethodDescriptor(javafx.scene.Node.class.getMethod("onMouseDragEnteredProperty", new Class[] {})); // NOI18N
            methods[METHOD_onMouseDragEnteredProperty124].setDisplayName ( "" );
            methods[METHOD_onMouseDragExitedProperty125] = new MethodDescriptor(javafx.scene.Node.class.getMethod("onMouseDragExitedProperty", new Class[] {})); // NOI18N
            methods[METHOD_onMouseDragExitedProperty125].setDisplayName ( "" );
            methods[METHOD_onMouseDraggedProperty126] = new MethodDescriptor(javafx.scene.Node.class.getMethod("onMouseDraggedProperty", new Class[] {})); // NOI18N
            methods[METHOD_onMouseDraggedProperty126].setDisplayName ( "" );
            methods[METHOD_onMouseDragOverProperty127] = new MethodDescriptor(javafx.scene.Node.class.getMethod("onMouseDragOverProperty", new Class[] {})); // NOI18N
            methods[METHOD_onMouseDragOverProperty127].setDisplayName ( "" );
            methods[METHOD_onMouseDragReleasedProperty128] = new MethodDescriptor(javafx.scene.Node.class.getMethod("onMouseDragReleasedProperty", new Class[] {})); // NOI18N
            methods[METHOD_onMouseDragReleasedProperty128].setDisplayName ( "" );
            methods[METHOD_onMouseEnteredProperty129] = new MethodDescriptor(javafx.scene.Node.class.getMethod("onMouseEnteredProperty", new Class[] {})); // NOI18N
            methods[METHOD_onMouseEnteredProperty129].setDisplayName ( "" );
            methods[METHOD_onMouseExitedProperty130] = new MethodDescriptor(javafx.scene.Node.class.getMethod("onMouseExitedProperty", new Class[] {})); // NOI18N
            methods[METHOD_onMouseExitedProperty130].setDisplayName ( "" );
            methods[METHOD_onMouseMovedProperty131] = new MethodDescriptor(javafx.scene.Node.class.getMethod("onMouseMovedProperty", new Class[] {})); // NOI18N
            methods[METHOD_onMouseMovedProperty131].setDisplayName ( "" );
            methods[METHOD_onMousePressedProperty132] = new MethodDescriptor(javafx.scene.Node.class.getMethod("onMousePressedProperty", new Class[] {})); // NOI18N
            methods[METHOD_onMousePressedProperty132].setDisplayName ( "" );
            methods[METHOD_onMouseReleasedProperty133] = new MethodDescriptor(javafx.scene.Node.class.getMethod("onMouseReleasedProperty", new Class[] {})); // NOI18N
            methods[METHOD_onMouseReleasedProperty133].setDisplayName ( "" );
            methods[METHOD_onRotateProperty134] = new MethodDescriptor(javafx.scene.Node.class.getMethod("onRotateProperty", new Class[] {})); // NOI18N
            methods[METHOD_onRotateProperty134].setDisplayName ( "" );
            methods[METHOD_onRotationFinishedProperty135] = new MethodDescriptor(javafx.scene.Node.class.getMethod("onRotationFinishedProperty", new Class[] {})); // NOI18N
            methods[METHOD_onRotationFinishedProperty135].setDisplayName ( "" );
            methods[METHOD_onRotationStartedProperty136] = new MethodDescriptor(javafx.scene.Node.class.getMethod("onRotationStartedProperty", new Class[] {})); // NOI18N
            methods[METHOD_onRotationStartedProperty136].setDisplayName ( "" );
            methods[METHOD_onScrollFinishedProperty137] = new MethodDescriptor(javafx.scene.Node.class.getMethod("onScrollFinishedProperty", new Class[] {})); // NOI18N
            methods[METHOD_onScrollFinishedProperty137].setDisplayName ( "" );
            methods[METHOD_onScrollProperty138] = new MethodDescriptor(javafx.scene.Node.class.getMethod("onScrollProperty", new Class[] {})); // NOI18N
            methods[METHOD_onScrollProperty138].setDisplayName ( "" );
            methods[METHOD_onScrollStartedProperty139] = new MethodDescriptor(javafx.scene.Node.class.getMethod("onScrollStartedProperty", new Class[] {})); // NOI18N
            methods[METHOD_onScrollStartedProperty139].setDisplayName ( "" );
            methods[METHOD_onSwipeDownProperty140] = new MethodDescriptor(javafx.scene.Node.class.getMethod("onSwipeDownProperty", new Class[] {})); // NOI18N
            methods[METHOD_onSwipeDownProperty140].setDisplayName ( "" );
            methods[METHOD_onSwipeLeftProperty141] = new MethodDescriptor(javafx.scene.Node.class.getMethod("onSwipeLeftProperty", new Class[] {})); // NOI18N
            methods[METHOD_onSwipeLeftProperty141].setDisplayName ( "" );
            methods[METHOD_onSwipeRightProperty142] = new MethodDescriptor(javafx.scene.Node.class.getMethod("onSwipeRightProperty", new Class[] {})); // NOI18N
            methods[METHOD_onSwipeRightProperty142].setDisplayName ( "" );
            methods[METHOD_onSwipeUpProperty143] = new MethodDescriptor(javafx.scene.Node.class.getMethod("onSwipeUpProperty", new Class[] {})); // NOI18N
            methods[METHOD_onSwipeUpProperty143].setDisplayName ( "" );
            methods[METHOD_onTouchMovedProperty144] = new MethodDescriptor(javafx.scene.Node.class.getMethod("onTouchMovedProperty", new Class[] {})); // NOI18N
            methods[METHOD_onTouchMovedProperty144].setDisplayName ( "" );
            methods[METHOD_onTouchPressedProperty145] = new MethodDescriptor(javafx.scene.Node.class.getMethod("onTouchPressedProperty", new Class[] {})); // NOI18N
            methods[METHOD_onTouchPressedProperty145].setDisplayName ( "" );
            methods[METHOD_onTouchReleasedProperty146] = new MethodDescriptor(javafx.scene.Node.class.getMethod("onTouchReleasedProperty", new Class[] {})); // NOI18N
            methods[METHOD_onTouchReleasedProperty146].setDisplayName ( "" );
            methods[METHOD_onTouchStationaryProperty147] = new MethodDescriptor(javafx.scene.Node.class.getMethod("onTouchStationaryProperty", new Class[] {})); // NOI18N
            methods[METHOD_onTouchStationaryProperty147].setDisplayName ( "" );
            methods[METHOD_onZoomFinishedProperty148] = new MethodDescriptor(javafx.scene.Node.class.getMethod("onZoomFinishedProperty", new Class[] {})); // NOI18N
            methods[METHOD_onZoomFinishedProperty148].setDisplayName ( "" );
            methods[METHOD_onZoomProperty149] = new MethodDescriptor(javafx.scene.Node.class.getMethod("onZoomProperty", new Class[] {})); // NOI18N
            methods[METHOD_onZoomProperty149].setDisplayName ( "" );
            methods[METHOD_onZoomStartedProperty150] = new MethodDescriptor(javafx.scene.Node.class.getMethod("onZoomStartedProperty", new Class[] {})); // NOI18N
            methods[METHOD_onZoomStartedProperty150].setDisplayName ( "" );
            methods[METHOD_opacityProperty151] = new MethodDescriptor(javafx.scene.Node.class.getMethod("opacityProperty", new Class[] {})); // NOI18N
            methods[METHOD_opacityProperty151].setDisplayName ( "" );
            methods[METHOD_opaqueInsetsProperty152] = new MethodDescriptor(javafx.scene.layout.Region.class.getMethod("opaqueInsetsProperty", new Class[] {})); // NOI18N
            methods[METHOD_opaqueInsetsProperty152].setDisplayName ( "" );
            methods[METHOD_paddingProperty153] = new MethodDescriptor(javafx.scene.layout.Region.class.getMethod("paddingProperty", new Class[] {})); // NOI18N
            methods[METHOD_paddingProperty153].setDisplayName ( "" );
            methods[METHOD_parentProperty154] = new MethodDescriptor(javafx.scene.Node.class.getMethod("parentProperty", new Class[] {})); // NOI18N
            methods[METHOD_parentProperty154].setDisplayName ( "" );
            methods[METHOD_parentToLocal155] = new MethodDescriptor(javafx.scene.Node.class.getMethod("parentToLocal", new Class[] {double.class, double.class})); // NOI18N
            methods[METHOD_parentToLocal155].setDisplayName ( "" );
            methods[METHOD_parentToLocal156] = new MethodDescriptor(javafx.scene.Node.class.getMethod("parentToLocal", new Class[] {javafx.geometry.Point2D.class})); // NOI18N
            methods[METHOD_parentToLocal156].setDisplayName ( "" );
            methods[METHOD_parentToLocal157] = new MethodDescriptor(javafx.scene.Node.class.getMethod("parentToLocal", new Class[] {javafx.geometry.Point3D.class})); // NOI18N
            methods[METHOD_parentToLocal157].setDisplayName ( "" );
            methods[METHOD_parentToLocal158] = new MethodDescriptor(javafx.scene.Node.class.getMethod("parentToLocal", new Class[] {double.class, double.class, double.class})); // NOI18N
            methods[METHOD_parentToLocal158].setDisplayName ( "" );
            methods[METHOD_parentToLocal159] = new MethodDescriptor(javafx.scene.Node.class.getMethod("parentToLocal", new Class[] {javafx.geometry.Bounds.class})); // NOI18N
            methods[METHOD_parentToLocal159].setDisplayName ( "" );
            methods[METHOD_pickOnBoundsProperty160] = new MethodDescriptor(javafx.scene.Node.class.getMethod("pickOnBoundsProperty", new Class[] {})); // NOI18N
            methods[METHOD_pickOnBoundsProperty160].setDisplayName ( "" );
            methods[METHOD_positionInArea161] = new MethodDescriptor(javafx.scene.layout.Region.class.getMethod("positionInArea", new Class[] {javafx.scene.Node.class, double.class, double.class, double.class, double.class, double.class, javafx.geometry.Insets.class, javafx.geometry.HPos.class, javafx.geometry.VPos.class, boolean.class})); // NOI18N
            methods[METHOD_positionInArea161].setDisplayName ( "" );
            methods[METHOD_prefHeight162] = new MethodDescriptor(javafx.scene.layout.Region.class.getMethod("prefHeight", new Class[] {double.class})); // NOI18N
            methods[METHOD_prefHeight162].setDisplayName ( "" );
            methods[METHOD_prefHeightProperty163] = new MethodDescriptor(javafx.scene.layout.Region.class.getMethod("prefHeightProperty", new Class[] {})); // NOI18N
            methods[METHOD_prefHeightProperty163].setDisplayName ( "" );
            methods[METHOD_prefWidth164] = new MethodDescriptor(javafx.scene.layout.Region.class.getMethod("prefWidth", new Class[] {double.class})); // NOI18N
            methods[METHOD_prefWidth164].setDisplayName ( "" );
            methods[METHOD_prefWidthProperty165] = new MethodDescriptor(javafx.scene.layout.Region.class.getMethod("prefWidthProperty", new Class[] {})); // NOI18N
            methods[METHOD_prefWidthProperty165].setDisplayName ( "" );
            methods[METHOD_pressedProperty166] = new MethodDescriptor(javafx.scene.Node.class.getMethod("pressedProperty", new Class[] {})); // NOI18N
            methods[METHOD_pressedProperty166].setDisplayName ( "" );
            methods[METHOD_pseudoClassStateChanged167] = new MethodDescriptor(javafx.scene.Node.class.getMethod("pseudoClassStateChanged", new Class[] {javafx.css.PseudoClass.class, boolean.class})); // NOI18N
            methods[METHOD_pseudoClassStateChanged167].setDisplayName ( "" );
            methods[METHOD_queryAccessibleAttribute168] = new MethodDescriptor(javafx.scene.Parent.class.getMethod("queryAccessibleAttribute", new Class[] {javafx.scene.AccessibleAttribute.class, java.lang.Object[].class})); // NOI18N
            methods[METHOD_queryAccessibleAttribute168].setDisplayName ( "" );
            methods[METHOD_relocate169] = new MethodDescriptor(javafx.scene.Node.class.getMethod("relocate", new Class[] {double.class, double.class})); // NOI18N
            methods[METHOD_relocate169].setDisplayName ( "" );
            methods[METHOD_removeEventFilter170] = new MethodDescriptor(javafx.scene.Node.class.getMethod("removeEventFilter", new Class[] {javafx.event.EventType.class, javafx.event.EventHandler.class})); // NOI18N
            methods[METHOD_removeEventFilter170].setDisplayName ( "" );
            methods[METHOD_removeEventHandler171] = new MethodDescriptor(javafx.scene.Node.class.getMethod("removeEventHandler", new Class[] {javafx.event.EventType.class, javafx.event.EventHandler.class})); // NOI18N
            methods[METHOD_removeEventHandler171].setDisplayName ( "" );
            methods[METHOD_requestFocus172] = new MethodDescriptor(javafx.scene.Node.class.getMethod("requestFocus", new Class[] {})); // NOI18N
            methods[METHOD_requestFocus172].setDisplayName ( "" );
            methods[METHOD_requestLayout173] = new MethodDescriptor(javafx.scene.Parent.class.getMethod("requestLayout", new Class[] {})); // NOI18N
            methods[METHOD_requestLayout173].setDisplayName ( "" );
            methods[METHOD_resize174] = new MethodDescriptor(javafx.scene.layout.Region.class.getMethod("resize", new Class[] {double.class, double.class})); // NOI18N
            methods[METHOD_resize174].setDisplayName ( "" );
            methods[METHOD_resizeRelocate175] = new MethodDescriptor(javafx.scene.Node.class.getMethod("resizeRelocate", new Class[] {double.class, double.class, double.class, double.class})); // NOI18N
            methods[METHOD_resizeRelocate175].setDisplayName ( "" );
            methods[METHOD_rotateProperty176] = new MethodDescriptor(javafx.scene.Node.class.getMethod("rotateProperty", new Class[] {})); // NOI18N
            methods[METHOD_rotateProperty176].setDisplayName ( "" );
            methods[METHOD_rotationAxisProperty177] = new MethodDescriptor(javafx.scene.Node.class.getMethod("rotationAxisProperty", new Class[] {})); // NOI18N
            methods[METHOD_rotationAxisProperty177].setDisplayName ( "" );
            methods[METHOD_scaleShapeProperty178] = new MethodDescriptor(javafx.scene.layout.Region.class.getMethod("scaleShapeProperty", new Class[] {})); // NOI18N
            methods[METHOD_scaleShapeProperty178].setDisplayName ( "" );
            methods[METHOD_scaleXProperty179] = new MethodDescriptor(javafx.scene.Node.class.getMethod("scaleXProperty", new Class[] {})); // NOI18N
            methods[METHOD_scaleXProperty179].setDisplayName ( "" );
            methods[METHOD_scaleYProperty180] = new MethodDescriptor(javafx.scene.Node.class.getMethod("scaleYProperty", new Class[] {})); // NOI18N
            methods[METHOD_scaleYProperty180].setDisplayName ( "" );
            methods[METHOD_scaleZProperty181] = new MethodDescriptor(javafx.scene.Node.class.getMethod("scaleZProperty", new Class[] {})); // NOI18N
            methods[METHOD_scaleZProperty181].setDisplayName ( "" );
            methods[METHOD_sceneProperty182] = new MethodDescriptor(javafx.scene.Node.class.getMethod("sceneProperty", new Class[] {})); // NOI18N
            methods[METHOD_sceneProperty182].setDisplayName ( "" );
            methods[METHOD_sceneToLocal183] = new MethodDescriptor(javafx.scene.Node.class.getMethod("sceneToLocal", new Class[] {double.class, double.class, boolean.class})); // NOI18N
            methods[METHOD_sceneToLocal183].setDisplayName ( "" );
            methods[METHOD_sceneToLocal184] = new MethodDescriptor(javafx.scene.Node.class.getMethod("sceneToLocal", new Class[] {javafx.geometry.Point2D.class, boolean.class})); // NOI18N
            methods[METHOD_sceneToLocal184].setDisplayName ( "" );
            methods[METHOD_sceneToLocal185] = new MethodDescriptor(javafx.scene.Node.class.getMethod("sceneToLocal", new Class[] {javafx.geometry.Bounds.class, boolean.class})); // NOI18N
            methods[METHOD_sceneToLocal185].setDisplayName ( "" );
            methods[METHOD_sceneToLocal186] = new MethodDescriptor(javafx.scene.Node.class.getMethod("sceneToLocal", new Class[] {double.class, double.class})); // NOI18N
            methods[METHOD_sceneToLocal186].setDisplayName ( "" );
            methods[METHOD_sceneToLocal187] = new MethodDescriptor(javafx.scene.Node.class.getMethod("sceneToLocal", new Class[] {javafx.geometry.Point2D.class})); // NOI18N
            methods[METHOD_sceneToLocal187].setDisplayName ( "" );
            methods[METHOD_sceneToLocal188] = new MethodDescriptor(javafx.scene.Node.class.getMethod("sceneToLocal", new Class[] {javafx.geometry.Point3D.class})); // NOI18N
            methods[METHOD_sceneToLocal188].setDisplayName ( "" );
            methods[METHOD_sceneToLocal189] = new MethodDescriptor(javafx.scene.Node.class.getMethod("sceneToLocal", new Class[] {double.class, double.class, double.class})); // NOI18N
            methods[METHOD_sceneToLocal189].setDisplayName ( "" );
            methods[METHOD_sceneToLocal190] = new MethodDescriptor(javafx.scene.Node.class.getMethod("sceneToLocal", new Class[] {javafx.geometry.Bounds.class})); // NOI18N
            methods[METHOD_sceneToLocal190].setDisplayName ( "" );
            methods[METHOD_screenToLocal191] = new MethodDescriptor(javafx.scene.Node.class.getMethod("screenToLocal", new Class[] {double.class, double.class})); // NOI18N
            methods[METHOD_screenToLocal191].setDisplayName ( "" );
            methods[METHOD_screenToLocal192] = new MethodDescriptor(javafx.scene.Node.class.getMethod("screenToLocal", new Class[] {javafx.geometry.Point2D.class})); // NOI18N
            methods[METHOD_screenToLocal192].setDisplayName ( "" );
            methods[METHOD_screenToLocal193] = new MethodDescriptor(javafx.scene.Node.class.getMethod("screenToLocal", new Class[] {javafx.geometry.Bounds.class})); // NOI18N
            methods[METHOD_screenToLocal193].setDisplayName ( "" );
            methods[METHOD_setMaxSize194] = new MethodDescriptor(javafx.scene.layout.Region.class.getMethod("setMaxSize", new Class[] {double.class, double.class})); // NOI18N
            methods[METHOD_setMaxSize194].setDisplayName ( "" );
            methods[METHOD_setMinSize195] = new MethodDescriptor(javafx.scene.layout.Region.class.getMethod("setMinSize", new Class[] {double.class, double.class})); // NOI18N
            methods[METHOD_setMinSize195].setDisplayName ( "" );
            methods[METHOD_setPrefSize196] = new MethodDescriptor(javafx.scene.layout.Region.class.getMethod("setPrefSize", new Class[] {double.class, double.class})); // NOI18N
            methods[METHOD_setPrefSize196].setDisplayName ( "" );
            methods[METHOD_shapeProperty197] = new MethodDescriptor(javafx.scene.layout.Region.class.getMethod("shapeProperty", new Class[] {})); // NOI18N
            methods[METHOD_shapeProperty197].setDisplayName ( "" );
            methods[METHOD_snappedBottomInset198] = new MethodDescriptor(javafx.scene.layout.Region.class.getMethod("snappedBottomInset", new Class[] {})); // NOI18N
            methods[METHOD_snappedBottomInset198].setDisplayName ( "" );
            methods[METHOD_snappedLeftInset199] = new MethodDescriptor(javafx.scene.layout.Region.class.getMethod("snappedLeftInset", new Class[] {})); // NOI18N
            methods[METHOD_snappedLeftInset199].setDisplayName ( "" );
            methods[METHOD_snappedRightInset200] = new MethodDescriptor(javafx.scene.layout.Region.class.getMethod("snappedRightInset", new Class[] {})); // NOI18N
            methods[METHOD_snappedRightInset200].setDisplayName ( "" );
            methods[METHOD_snappedTopInset201] = new MethodDescriptor(javafx.scene.layout.Region.class.getMethod("snappedTopInset", new Class[] {})); // NOI18N
            methods[METHOD_snappedTopInset201].setDisplayName ( "" );
            methods[METHOD_snapshot202] = new MethodDescriptor(javafx.scene.Node.class.getMethod("snapshot", new Class[] {javafx.scene.SnapshotParameters.class, javafx.scene.image.WritableImage.class})); // NOI18N
            methods[METHOD_snapshot202].setDisplayName ( "" );
            methods[METHOD_snapshot203] = new MethodDescriptor(javafx.scene.Node.class.getMethod("snapshot", new Class[] {javafx.util.Callback.class, javafx.scene.SnapshotParameters.class, javafx.scene.image.WritableImage.class})); // NOI18N
            methods[METHOD_snapshot203].setDisplayName ( "" );
            methods[METHOD_snapToPixelProperty204] = new MethodDescriptor(javafx.scene.layout.Region.class.getMethod("snapToPixelProperty", new Class[] {})); // NOI18N
            methods[METHOD_snapToPixelProperty204].setDisplayName ( "" );
            methods[METHOD_startDragAndDrop205] = new MethodDescriptor(javafx.scene.Node.class.getMethod("startDragAndDrop", new Class[] {javafx.scene.input.TransferMode[].class})); // NOI18N
            methods[METHOD_startDragAndDrop205].setDisplayName ( "" );
            methods[METHOD_startFullDrag206] = new MethodDescriptor(javafx.scene.Node.class.getMethod("startFullDrag", new Class[] {})); // NOI18N
            methods[METHOD_startFullDrag206].setDisplayName ( "" );
            methods[METHOD_styleProperty207] = new MethodDescriptor(javafx.scene.Node.class.getMethod("styleProperty", new Class[] {})); // NOI18N
            methods[METHOD_styleProperty207].setDisplayName ( "" );
            methods[METHOD_toBack208] = new MethodDescriptor(javafx.scene.Node.class.getMethod("toBack", new Class[] {})); // NOI18N
            methods[METHOD_toBack208].setDisplayName ( "" );
            methods[METHOD_toFront209] = new MethodDescriptor(javafx.scene.Node.class.getMethod("toFront", new Class[] {})); // NOI18N
            methods[METHOD_toFront209].setDisplayName ( "" );
            methods[METHOD_toString210] = new MethodDescriptor(javafx.scene.Node.class.getMethod("toString", new Class[] {})); // NOI18N
            methods[METHOD_toString210].setDisplayName ( "" );
            methods[METHOD_translateXProperty211] = new MethodDescriptor(javafx.scene.Node.class.getMethod("translateXProperty", new Class[] {})); // NOI18N
            methods[METHOD_translateXProperty211].setDisplayName ( "" );
            methods[METHOD_translateYProperty212] = new MethodDescriptor(javafx.scene.Node.class.getMethod("translateYProperty", new Class[] {})); // NOI18N
            methods[METHOD_translateYProperty212].setDisplayName ( "" );
            methods[METHOD_translateZProperty213] = new MethodDescriptor(javafx.scene.Node.class.getMethod("translateZProperty", new Class[] {})); // NOI18N
            methods[METHOD_translateZProperty213].setDisplayName ( "" );
            methods[METHOD_usesMirroring214] = new MethodDescriptor(javafx.scene.Node.class.getMethod("usesMirroring", new Class[] {})); // NOI18N
            methods[METHOD_usesMirroring214].setDisplayName ( "" );
            methods[METHOD_visibleProperty215] = new MethodDescriptor(javafx.scene.Node.class.getMethod("visibleProperty", new Class[] {})); // NOI18N
            methods[METHOD_visibleProperty215].setDisplayName ( "" );
            methods[METHOD_widthProperty216] = new MethodDescriptor(javafx.scene.layout.Region.class.getMethod("widthProperty", new Class[] {})); // NOI18N
            methods[METHOD_widthProperty216].setDisplayName ( "" );
        }
        catch( Exception e) {}//GEN-HEADEREND:Methods
        // Here you can add code for customizing the methods array.

        return methods;     }//GEN-LAST:Methods

    private static java.awt.Image iconColor16 = null;//GEN-BEGIN:IconsDef
    private static java.awt.Image iconColor32 = null;
    private static java.awt.Image iconMono16 = null;
    private static java.awt.Image iconMono32 = null;//GEN-END:IconsDef
    private static String iconNameC16 = null;//GEN-BEGIN:Icons
    private static String iconNameC32 = null;
    private static String iconNameM16 = null;
    private static String iconNameM32 = null;//GEN-END:Icons

    private static final int defaultPropertyIndex = -1;//GEN-BEGIN:Idx
    private static final int defaultEventIndex = -1;//GEN-END:Idx


//GEN-FIRST:Superclass
    // Here you can add code for customizing the Superclass BeanInfo.

//GEN-LAST:Superclass
    /**
     * Gets the bean's <code>BeanDescriptor</code>s.
     *
     * @return BeanDescriptor describing the editable properties of this bean.
     * May return null if the information should be obtained by automatic
     * analysis.
     */
    @Override
    public BeanDescriptor getBeanDescriptor() {
        return getBdescriptor();
    }

    /**
     * Gets the bean's <code>PropertyDescriptor</code>s.
     *
     * @return An array of PropertyDescriptors describing the editable
     * properties supported by this bean. May return null if the information
     * should be obtained by automatic analysis.
     * <p>
     * If a property is indexed, then its entry in the result array will belong
     * to the IndexedPropertyDescriptor subclass of PropertyDescriptor. A client
     * of getPropertyDescriptors can use "instanceof" to check if a given
     * PropertyDescriptor is an IndexedPropertyDescriptor.
     */
    @Override
    public PropertyDescriptor[] getPropertyDescriptors() {
        return getPdescriptor();
    }

    /**
     * Gets the bean's <code>EventSetDescriptor</code>s.
     *
     * @return An array of EventSetDescriptors describing the kinds of events
     * fired by this bean. May return null if the information should be obtained
     * by automatic analysis.
     */
    @Override
    public EventSetDescriptor[] getEventSetDescriptors() {
        return getEdescriptor();
    }

    /**
     * Gets the bean's <code>MethodDescriptor</code>s.
     *
     * @return An array of MethodDescriptors describing the methods implemented
     * by this bean. May return null if the information should be obtained by
     * automatic analysis.
     */
    @Override
    public MethodDescriptor[] getMethodDescriptors() {
        return getMdescriptor();
    }

    /**
     * A bean may have a "default" property that is the property that will
     * mostly commonly be initially chosen for update by human's who are
     * customizing the bean.
     *
     * @return Index of default property in the PropertyDescriptor array
     * returned by getPropertyDescriptors.
     * <P>
     * Returns -1 if there is no default property.
     */
    @Override
    public int getDefaultPropertyIndex() {
        return defaultPropertyIndex;
    }

    /**
     * A bean may have a "default" event that is the event that will mostly
     * commonly be used by human's when using the bean.
     *
     * @return Index of default event in the EventSetDescriptor array returned
     * by getEventSetDescriptors.
     * <P>
     * Returns -1 if there is no default event.
     */
    @Override
    public int getDefaultEventIndex() {
        return defaultEventIndex;
    }

    /**
     * This method returns an image object that can be used to represent the
     * bean in toolboxes, toolbars, etc. Icon images will typically be GIFs, but
     * may in future include other formats.
     * <p>
     * Beans aren't required to provide icons and may return null from this
     * method.
     * <p>
     * There are four possible flavors of icons (16x16 color, 32x32 color, 16x16
     * mono, 32x32 mono). If a bean choses to only support a single icon we
     * recommend supporting 16x16 color.
     * <p>
     * We recommend that icons have a "transparent" background so they can be
     * rendered onto an existing background.
     *
     * @param iconKind The kind of icon requested. This should be one of the
     * constant values ICON_COLOR_16x16, ICON_COLOR_32x32, ICON_MONO_16x16, or
     * ICON_MONO_32x32.
     * @return An image object representing the requested icon. May return null
     * if no suitable icon is available.
     */
    @Override
    public java.awt.Image getIcon(int iconKind) {
        switch (iconKind) {
            case ICON_COLOR_16x16:
                if (iconNameC16 == null) {
                    return null;
                } else {
                    if (iconColor16 == null) {
                        iconColor16 = loadImage(iconNameC16);
                    }
                    return iconColor16;
                }
            case ICON_COLOR_32x32:
                if (iconNameC32 == null) {
                    return null;
                } else {
                    if (iconColor32 == null) {
                        iconColor32 = loadImage(iconNameC32);
                    }
                    return iconColor32;
                }
            case ICON_MONO_16x16:
                if (iconNameM16 == null) {
                    return null;
                } else {
                    if (iconMono16 == null) {
                        iconMono16 = loadImage(iconNameM16);
                    }
                    return iconMono16;
                }
            case ICON_MONO_32x32:
                if (iconNameM32 == null) {
                    return null;
                } else {
                    if (iconMono32 == null) {
                        iconMono32 = loadImage(iconNameM32);
                    }
                    return iconMono32;
                }
            default:
                return null;
        }
    }
    
}
