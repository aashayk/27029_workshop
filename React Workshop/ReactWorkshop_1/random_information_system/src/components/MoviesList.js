import React from "react";

export const MovieList = ({ list }) => {
    let stylingObject = {
        table: {
          color: "purple",
          border: "1px solid purple",
          padding:"20px"
        },
      };
  return (
    <div>
      <table style={stylingObject.table}>
        <tr>
          <th>Movie List</th>
        </tr>
        <tr>
          <td>
            {list.map((title) => {
              return <li type="1">{title}</li>;
            })}
          </td>
        </tr>
      </table>
    </div>
  );
};
