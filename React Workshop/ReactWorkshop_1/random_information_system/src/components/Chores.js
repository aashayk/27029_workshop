import React from "react";

export const ChoresList = ({list}) => {
  let stylingObject = {
    table: {
      color: "red",
      border: "1px solid red",
      padding:"20px"
    },
  };
  return (
    <div>
      <table style={stylingObject.table}>
        <tr>
          <th>Today's Chores</th>
        </tr>
        <tr>
            <td>
            {list.map(title => {
                return <li>{title}</li>
            })}
            </td>
        </tr>
      </table>
    </div>
  );
};
