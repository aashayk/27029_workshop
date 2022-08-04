import React from 'react';

export const ImageComponent = ({imgSrc}) => {
    return (
        <div>
            {imgSrc.map(img => {
                return <div><img src={img}></img></div>
            })}
        </div>
    )
}