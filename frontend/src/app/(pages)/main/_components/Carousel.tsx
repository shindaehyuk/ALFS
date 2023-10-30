"use client";

import React from "react";
import Slider from "react-slick";
import "slick-carousel/slick/slick.css";
import "slick-carousel/slick/slick-theme.css";
import Image from "next/image";
import Alps from "../../../_asset/img/알프스.jpg";
import Banner from "../_components/WEB BANNER 1.png";
import { BsFillArrowRightCircleFill, BsFillArrowLeftCircleFill } from "react-icons/bs";

function SampleNextArrow(props: any) {
  const { className, style, onClick } = props;
  return (
    <div
      style={{
        position: "absolute",
        right: "10%",
        top: "50%",
        zIndex: 1,
        cursor: "pointer",
      }}
    >
      <BsFillArrowRightCircleFill color="darkgray" className="w-[50px] h-[50px]" onClick={onClick} />
    </div>
  );
}

function SamplePrevArrow(props: any) {
  const { className, style, onClick } = props;
  return (
    <div
      style={{
        position: "absolute",
        left: "10%",
        top: "50%",
        zIndex: 1,
        cursor: "pointer",
      }}
    >
      <BsFillArrowLeftCircleFill color="darkgray" className="w-[50px] h-[50px] decoration-gray-400" onClick={onClick} />
    </div>
  );
}

export default function Carousel() {
  const settings = {
    dots: true,
    slidesToShow: 1,
    slidesToScroll: 1,
    autoplay: true,
    autoplaySpeed: 3000,
    arrow: true,
    nextArrow: <SampleNextArrow />,
    prevArrow: <SamplePrevArrow />,
  };
  return (
    <div className="min-w-[1440px] flex justify-center">
      <div className="w-[1440px]">
        <Slider {...settings}>
          <div className="">
            <Image src={Banner} alt="asdf"></Image>
          </div>
          <div>
            <h3>2</h3>
          </div>
          <div>
            <h3>3</h3>
          </div>
          <div>
            <h3>4</h3>
          </div>
          <div>
            <h3>5</h3>
          </div>
          <div>
            <h3>6</h3>
          </div>
        </Slider>
      </div>
    </div>
  );
}